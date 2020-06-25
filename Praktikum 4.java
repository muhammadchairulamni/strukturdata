package Queue;
 public class Queue{
     
     private int head = 0;
     private int tail = 0;
     private int[] isi = new int [4];
     
     public Queue () {}
     
     public int GetIsiByIndex(int index)
     {
         return isi[index];
     }
     
     public void Enqueue(int x)
     {
         if (tail < 4){
             isi[tail] = x;
             tail++;
         }else{
             System.out.println("Penuh");
     }
     }
     
     public int Dequeue()
     {
         if(tail != head){
             int temp = isi [head];
             for (int a = head; a < tail; a++){
                 if (a == tail -1) {
                     isi [a] = 0;
                 }else{
                     isi [a] = isi [a+1];
                 }
             }
             tail --;
             return temp;
         }else{
             System.out.println("Kosong");
             return 0;
         }
         }
         
         public void Print()
         {
             String teks = "";
             for (int a=0; a<4; a++){
                 teks += isi[a]+",";
             }
             System.out.println(teks);
         }
         
         public static void main(String[]args){
             Queue q1 = new Queue();
             
             q1.Enqueue(31);
             q1.Enqueue(32);
             q1.Enqueue(33);
             q1.Enqueue(34);
             q1.Enqueue(35);
             q1.Enqueue(36);
             q1.Print();
             
             System.out.println(q1.Dequeue());
             q1.Print();
             System.out.println(q1.Dequeue());
             q1.Print();
             System.out.println(q1.Dequeue());
             q1.Print();
             System.out.println(q1.Dequeue());
             q1.Print();
             System.out.println(q1.Dequeue());
             q1.Print();
         }
     }
