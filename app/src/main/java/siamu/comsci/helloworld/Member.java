package siamu.comsci.helloworld;

import java.io.Serializable;

/**
 * Created by HP-User on 21/2/2561.
 */

public class Member implements Serializable {
    public String _name;
    public String _address;
    public Member(String name,String address){
        _name=name;
        _address=name;


    }
    public  void setName(String name){
        _name=name;

    }
    public String getName(){
        return _name;
    }
    public void setAddress(String address){
        _address=address;

    }
    public String getAddress(){
        return _address;
    }
}
