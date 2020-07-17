package co.simplon;

public class Cars {
    private String category_name;
    private String name;
    private String color;

    Cars(String category_name,String name,String color){
        this.category_name=category_name;
        this.name=name;
        this.color=color;
    }
    
    public String getCategoryName(){
        return this.category_name;
    }

    public void setCategoryName(String category){
        this.category_name=category;
    }

     public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

     public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }


    
}