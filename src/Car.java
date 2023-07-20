import java.awt.color.ICC_ColorSpace;

public class Car {
    private String _kod;
    private int _id;
    private String _model;
    private String _color;
    private int _price;
    private String _fueltype;
    public Car(String _kod,int _id,String _model,String _color,int _price,String _fueltype){
        this._kod=_kod;
        this._id=_id;
        this._model=_model;
        this._color=_color;
        this._price=_price;
        this._fueltype=_fueltype;
        System.out.println("Constructor worked");
    }
    public Car(){

    }
    public String getKod(){
        return _kod;
    }
    public void setKod(String kod){
        _kod=kod;
    }
    public int getId(){
        return _id;
    }
    public void setId(int id){
    _id=id;
    }
    public String getModel(){
    return _model;
    }
    public void setModel(String model){
        _model=model;
    }
    public String getColor(){
        return _color;
    }
    public void setColor(String color){
        _color=color;
    }
    public int getPrice(){
        return _price;
    }
    public void setPrice(int price){
        _price=price;
    }
    public String getFueltype(){
        return _fueltype;
    }
    public void setFueltype(String fueltype){
        _fueltype=fueltype;
    }

}
