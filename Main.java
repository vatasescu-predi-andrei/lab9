import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //File opening and creating a new scanner
        File patientsList = new File("patients.txt");
        Scanner in = null;
        try {
            in = new Scanner(patientsList);
        }catch(FileNotFoundException e){
            System.out.println("There is no such file");
        }

        PriorityQueue<Patient> orderedQueue = new PriorityQueue<>();

        //Reading the input using a while loop
        while(in.hasNextLine()){
            String firstName = in.nextLine();
            String lastName = in.nextLine();
            String illness = in.nextLine();
            int severityLevel = in.nextInt();
            if(in.hasNextLine()){
                in.nextLine();
            }

            //Creates a new patient and adds it straight to the ordered queue
            orderedQueue.add(new Patient(firstName,lastName,illness,severityLevel));
        }

        //Output code
        System.out.println("The doctor will see patients in the following order:");
        while(!orderedQueue.isEmpty()) {
            System.out.println(orderedQueue.poll());
        }
    }
}
