/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 *
 * @author burge
 */
public class SUV extends Car{
    
    private String type;

    public SUV(CarLogo cl, String type) {
        super(cl);
        setType(type);
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) throws IllegalArgumentException{
        if((type!=null)&&!(type.trim().equals(""))){
            this.type=type;
        }
        else{
            throw new IllegalArgumentException("The car type can not be "
                    +"nothing, please try again > ");
        }
    }
    
    @Override
    public String carTypeDescription(){
        String s = "";
        s+="SUV is a sport utility vehicle!";
        
        return s;
    }
    
    
}
