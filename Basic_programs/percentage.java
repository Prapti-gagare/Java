import java.util.Scanner;

class percentage 
{

    
    static double calculatePercentage(int marks[], int totalMarksPerSubject)
    {
        int sum = 0;
        for (int mark : marks) 
        {
            sum += mark;
        }
        return (sum * 100.0) / (marks.length * totalMarksPerSubject);
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        System.out.println("Enter marks for each subject: ");
        for (int i = 0; i < n; i++) 
        {
            marks[i] = sc.nextInt();
        }

        System.out.print("Enter total marks per subject: ");
        int totalMarks = sc.nextInt();

        double percentage = calculatePercentage(marks, totalMarks);
        System.out.printf("Percentage = %.2f%%\n", percentage);

       
    }
}
