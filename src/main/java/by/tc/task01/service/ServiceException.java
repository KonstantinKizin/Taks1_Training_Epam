package by.tc.task01.service;

public class ServiceException extends RuntimeException {

    public ServiceException(String e ){
        super(e);
    }

    public ServiceException(Exception e){
        super(e);
    }

    public ServiceException(){
        super();
    }

}
