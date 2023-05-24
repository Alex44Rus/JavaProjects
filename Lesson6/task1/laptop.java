package Lesson6.task1;

public class laptop {
    private String brand;
    private String model;
    private Integer screensize;
    private Integer ram;
    private Integer memory;
    private String os;
    private Boolean offer = false; //бронь, оформление - true

    public laptop(String brand, String model, Integer ram, String os){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.os = os;
    }
    public Integer getScreensize(){
        return screensize;
    }
    public void setScreensize(Integer screensize){
        this.screensize = screensize;
    }

    public Integer getMemory(){
        return memory;
    }
    public void setMemory(Integer memory){
        this.memory = memory;
    }
   
    
    public void Offer(){
        if (offer == false){
            this.offer=true;
        }
        else System.out.println("Этот ноутбук зарезервирован");
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(" ");
        sb.append("Экран ");
        sb.append(this.screensize);
        sb.append(System.lineSeparator());
        sb.append(this.ram);
        sb.append("Gb ОЗУ ");
        sb.append(" ");
        sb.append(this.memory);
        sb.append("Gb Дискового пространства ");
        sb.append(System.lineSeparator());
        sb.append(this.os);
        sb.append(" ");
        if (this.offer == false) sb.append("В продаже ");
        else sb.append("Резерв ");

        return(sb.toString());

    }
    public Integer getRam() {
        return this.ram;
    }
    public Object getOs() {
        return this.os;
    }
}
