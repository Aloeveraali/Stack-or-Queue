

public class Main {
        public static void main(String[] args) {
            FileIO reader = new FileIO();
            String[] input = reader.load("/Users/eimaanali/Desktop/queue.txt");
            queue qfile = new queue(500); //size of array in class queue

            //iterating through the array
            for(int i=0; i <input.length; i++)
            {
                //inserting values that contain inseart and substringing
                if(input[i].contains("INSERT"))
                {
                    qfile.insert(input[i].substring(7));
                }
                //removing values with remove or null
                else if(input[i].contains("REMOVE"))
                {
                    qfile.remove();
                }
            }

            //result displayed
            System.out.println(qfile.peekFront());
        }
    }
