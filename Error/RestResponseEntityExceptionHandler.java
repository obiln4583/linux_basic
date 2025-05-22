package com.dailycodebuffer.Springboot.tutorial.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    /*here we have to add what type of exception we need to handle this class*/
    @ExceptionHandler(DepartmentNotFoundException.class)
    /*here we need to send the error message back to response entity*/
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundException exception,  WebRequest request) {
        ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }


}
/*output
{
    "status": "NOT_FOUND",
    "message": "Department not found"
}
 */