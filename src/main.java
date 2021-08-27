public class main{

    static class Container {

        int MIN_number;
        int MAX_number;
    }
//method to find the minimum and maximum number in an array
    static Container Num_Finder(int arr[], int limit) {
        Container Con = new Container();
        int i;
//if the size of the array is one copy zeroth index in minimum and maximum number
        if (limit== 1) {
            Con.MAX_number = arr[0];
            Con.MIN_number = arr[0];
            return Con;
        }

        if (arr[0] > arr[1]) {
            Con.MAX_number = arr[0];
            Con.MIN_number = arr[1];
        } else {
            Con.MAX_number = arr[1];
            Con.MIN_number = arr[0];
        }
//iterate an array from second index till maximum size of the array
        for (i = 2; i < limit; i++) {
            if (arr[i] > Con.MAX_number) {
                Con.MAX_number = arr[i];
            } else if (arr[i] < Con.MIN_number) {
                Con.MIN_number = arr[i];
            }
        }

        return Con;
    }
//driver method
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int limit = 6;
        Container Con = Num_Finder(arr, limit);
        System.out.printf("\n The required minimum number is %d", Con.MIN_number);
        System.out.printf("\nThe required maximum number is %d", Con.MAX_number);
    }
}
