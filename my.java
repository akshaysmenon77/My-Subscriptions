import java.io.*;
public class my
{
    public static void main(String args[])throws IOException
    {
        float b[]=new float[10];
        int i,j,x=1;
        float sum=0,toi=0,hindu=0,et=0,bm=0,ht=0,input=0,sum1,sum2,sum3,sum4;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String tmp[][]={
                            {"      ","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"},
                            {"TOI","     3","     3  ","      3","       3","      3","     5","       6"},
                            {"Hindu","  2.5","   2.5  ","    2.5","     2.5","    2.5","   2.5","      6"},
                            {"ET","      4","     4  ","      4","       4","      4","     4","      10"},
                            {"BM","     1.5","   1.5  ","    1.5","     1.5","    1.5","   1.5","     1.5"},
                            {"HT","      2","     2  ","      2","       2","      2","     4","       4"},
        };//DATA SET
        for(i=0;i<6;i++)
        {
            for(j=0;j<8;j++)
            {
                System.out.print(tmp[i][j]+" ");
            }
            System.out.println("");
        }//displaying data set in form of Tables 
        //addition of rows
   toi=Float.parseFloat(tmp[1][1])+Float.parseFloat(tmp[1][2])+Float.parseFloat(tmp[1][3])+Float.parseFloat(tmp[1][4])+Float.parseFloat(tmp[1][5])+Float.parseFloat(tmp[1][6])+Float.parseFloat(tmp[1][7]);
   hindu=Float.parseFloat(tmp[2][1])+Float.parseFloat(tmp[2][2])+Float.parseFloat(tmp[2][3])+Float.parseFloat(tmp[2][4])+Float.parseFloat(tmp[2][5])+Float.parseFloat(tmp[2][6])+Float.parseFloat(tmp[2][7]);
   et=Float.parseFloat(tmp[3][1])+Float.parseFloat(tmp[3][2])+Float.parseFloat(tmp[3][3])+Float.parseFloat(tmp[3][4])+Float.parseFloat(tmp[3][5])+Float.parseFloat(tmp[3][6])+Float.parseFloat(tmp[3][7]);
   bm=Float.parseFloat(tmp[4][1])+Float.parseFloat(tmp[4][2])+Float.parseFloat(tmp[4][3])+Float.parseFloat(tmp[4][4])+Float.parseFloat(tmp[4][5])+Float.parseFloat(tmp[4][6])+Float.parseFloat(tmp[4][7]);
   ht=Float.parseFloat(tmp[5][1])+Float.parseFloat(tmp[5][2])+Float.parseFloat(tmp[5][3])+Float.parseFloat(tmp[5][4])+Float.parseFloat(tmp[5][5])+Float.parseFloat(tmp[5][6])+Float.parseFloat(tmp[5][7]);
   
System.out.print("Input: ");
input=Integer.parseInt(br.readLine());

if((toi+hindu)<=input)//toi
{
    System.out.print("{'TOI','Hindu'}, ");
}
if((toi+et)<=input)
{
    System.out.print("{'TOI','ET'}, ");
}
if((toi+bm)<=input)
{
    System.out.print("{'TOI','BM'}, ");
}
if((toi+ht)<=input)
{
    System.out.print("{'TOI','HT'}, ");
}


if((hindu+et)<=input)//et
{
    System.out.print("{'Hindu','ET'}, ");
}
if((hindu+bm)<=input)
{
    System.out.print("{'Hindu','BM'}, ");
}
if((hindu+ht)<=input)
{
    System.out.print("{'Hindu','HT'}, ");
}




if((et+bm)<=input)//et
{
    System.out.print("{'ET','BM'}, ");
}
if((et+ht)<=input)
{
    System.out.print("{'ET','HT'}, ");
}




if((bm+et)<=input)//bm
{
    System.out.print("{'BM','ET'}, ");
}

if((bm+ht)<=input)
{
    System.out.println("{'BM','HT'}");
}

        }//closing of public main
}//closing of class