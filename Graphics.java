public class Graphics{
    private int width;
    private int height;
    public void getInfo(){
        System.out.print("width="+width+","+"height="+height+"——");
    }
    public Graphics(){}
    public Graphics(int width,int height){
        this.width = width;
        this.height = height;
    }
}
