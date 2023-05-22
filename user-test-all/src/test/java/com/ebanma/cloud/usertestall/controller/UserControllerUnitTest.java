package com.ebanma.cloud.usertestall.controller;

import com.ebanma.cloud.usertestall.domain.common.PageQuery;
import com.ebanma.cloud.usertestall.domain.common.PageResult;
import com.ebanma.cloud.usertestall.domain.common.Result;
import com.ebanma.cloud.usertestall.domain.dto.UserDTO;
import com.ebanma.cloud.usertestall.domain.dto.UserQueryDTO;
import com.ebanma.cloud.usertestall.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerUnitTest {
    @InjectMocks
    private  UserController userController;
    @Mock
    private UserService userService;
    private List<UserDTO> list=new ArrayList<UserDTO>();

    @Before
    public void setUp() throws Exception {
        userController=new UserController(userService);
    }
    @Test
    public void should_invoke_user_service_save_success(){
        //given
        UserDTO userDTO=new UserDTO();
        Mockito.when(userService.save(userDTO)).thenReturn(1);
        //when
        userController.save(userDTO);
        //then
        verify(userService).save(any(UserDTO.class));
    }
    @Test
    public void should_invoke_user_service_save_fail(){
        //given
        UserDTO userDTO=new UserDTO();
        Mockito.when(userService.save(userDTO)).thenReturn(0);
        //when
        userController.save(userDTO);
        //then
        verify(userService).save(any(UserDTO.class));
    }
    @Test
    public void should_invoke_user_service_update_success(){
        //given
        Long id=1l;
        UserDTO userDTO=new UserDTO();
        Mockito.when(userService.update(id,userDTO)).thenReturn(1);
        //when
        userController.update(id,userDTO);
        //then
        verify(userService).update(any(Long.class),any(UserDTO.class));
    }
    @Test
    public void should_invoke_user_service_update_fail(){
        //given
        Long id=1l;
        UserDTO userDTO=new UserDTO();
        Mockito.when(userService.update(id,userDTO)).thenReturn(0);
        //when
        userController.update(id,userDTO);
        //then
        verify(userService).update(any(Long.class),any(UserDTO.class));
    }
    @Test
    public void should_invoke_user_service_delete_success(){
        //given
        Long id=1l;
        Mockito.when(userService.delete(id)).thenReturn(1);
        //when
        userController.delete(id);
        //then
        verify(userService).delete(any(Long.class));
    }
    @Test
    public void should_invoke_user_service_delete_fail(){
        //given
        Long id=1l;
        Mockito.when(userService.delete(id)).thenReturn(0);
        //when
        userController.delete(id);
        //then
        verify(userService).delete(any(Long.class));
    }
    @Test
    public void should_invoke_user_service_query_success(){
        //given
        UserDTO userDTO=new UserDTO();
        userDTO = new UserDTO();
        userDTO.setUsername("username");
        userDTO.setPassword("password");
        userDTO.setEmail("123661231@qq.com");
        userDTO.setAge(25);
        userDTO.setPhone("13977078880");
        userDTO.setVersion(1L);
        list.add(userDTO);
        PageResult<List<UserDTO>> pageResult = new PageResult<>();
        pageResult.setData(list);
        UserQueryDTO userQueryDTO = new UserQueryDTO();
        userQueryDTO.setUsername(userDTO.getUsername());
        Mockito.doReturn(pageResult).when(userService).query(Mockito.any(PageQuery.class));
        //when
        userController.query(1,1,userQueryDTO);
        //then
        verify(userService).query(any(PageQuery.class));


        //Result success = userController.query(1,1,userQueryDTO);
        //Assertions.assertTrue(success.getSuccess());
    }

}