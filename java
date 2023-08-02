class myThread extends Thread{
public final int val;
public myThread(String name,int val){
    super(name);
    this.val=val;
}
public void run(){
String threadName=Thread.currentThread().getName();
for(int i=1;i<=val;i++){
    System.out.println( "Helloo world");
    System.out.println("Current threa running on " + threadName);
}
}
 public static void main(String[] args) {
int val=10;
myThread th=new myThread("", val);
th.run();    
}
}
