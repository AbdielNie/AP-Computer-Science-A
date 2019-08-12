public class Adminstrator extends Teacher{
    //private String name;
    //private Course[] courses;
    private String[] responsibilities;
    
    public Adminstrator(){
        super();
    }
    
    @Override
    public void responsibilities(){
        System.out.println(this.name + "'s responsibilities:" + showResponsibilities());
    }
    
    public String[] getResponsibilities(){
        return this.responsibilities;   
    }
    public String showResponsibilities(){
        String str = "";
        for(String r : responsibilities){
            str += "\t" + r;
        }
        return str;
    }
    
}