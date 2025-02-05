package stringbuffer.performance;



public class StringBuildervsBuffer {


    public long StringBuffer(){
        long startTime= System.nanoTime();

        StringBuffer sb=new StringBuffer();
        String text="akshit";

        for(int i=0;i<100000;i++){
            sb.append(text);
        }
        long endTime=System.nanoTime();
        return endTime-startTime;
    }

    public long StringBuilder(){
        long startTime= System.nanoTime();

        StringBuilder srb=new StringBuilder();
        String text="akshit";

        for(int i=0;i<100000;i++){
            srb.append(text);
        }
        long endTime=System.nanoTime();
        return endTime-startTime;
    }



}
