package com.appexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="this employee is not found !")
public class InvalidEmployeeDetail extends Exception{
	

}
