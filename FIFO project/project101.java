import javax.swing.*;
class project101
{
public static void main(String args[])
{
int frames, position= 0, miss= 0, page_length , hit= 0;
int buffer[];
int pages [];
int mem_layout [][];

JTextField Number= new JTextField();
Object[] Welcome = {"\n \t \t \t \t \t \t \t \t \t \t \t \t *****Welcome***** \t \t \t \t \t \t \t \t \t \t \t \t \n \n ****Enter The number of frames**** \n",Number};
JOptionPane.showConfirmDialog(null,Welcome," \t FIRST IN FIRST OUT \t ",JOptionPane.OK_CANCEL_OPTION);
String s1=Number.getText();
frames=Integer.parseInt(s1);
 
JTextField Input=new JTextField();
Object[] Input1 = {" \n ***Please Enter the Number of Pages***  \n",Input};
JOptionPane.showConfirmDialog(null,Input1," \t Number of Pages \t ",JOptionPane.OK_CANCEL_OPTION);
String s2=Input.getText();
page_length=Integer.parseInt(s2);

pages = new int[page_length]; 
mem_layout = new int[page_length][frames];
buffer = new int[frames];
for(int j = 0; j < frames; j++)
buffer[j] = -1;


String[] Input3= new String[page_length];
for(int i = 0; i < page_length; i++)
{
Input3[i]=JOptionPane.showInputDialog(null,"\n \t \t \t \t \t \t \t \t \t ****Enter Pages Number**** \t \t \t \t \t \t \t \t \t ");
pages[i]=Integer.parseInt(Input3[i]);
}

for(int i = 0; i < page_length; i++)
        {
         int search = -1;
         for(int j = 0; j < frames; j++)
         {
          if(buffer[j] == pages[i])
          {
           search = j;
           hit++;
           break;
          } 
         }
         if(search == -1)
         {
          buffer[position] = pages[i];
          miss++;
          position++;
          if(position == frames)
           position = 0;
         }
            for(int j = 0; j < frames; j++)
                mem_layout[i][j] = buffer[j];
        }
        System.out.println("\n \t\t\t\t\t\t\t\t\t\t\t\t\t ****MEMORY LAYOUT**** \t\t\t\t\t\t\t\t\t\t\t\t\t \n");
        for(int i = 0; i < frames; i++)
        
        {
        	
            for(int j = 0; j < page_length; j++)
                System.out.printf(" %2d ",mem_layout[j][i]);
            System.out.println();
        }
        
JOptionPane.showMessageDialog(null,"The number of hits : " +hit+"\n The Number of miss : "+miss);

}
}









