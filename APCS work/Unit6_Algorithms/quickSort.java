
/**
 * Write a description of class quickSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class quickSort
{
    /*
    public static void quickSort(int[] arr, int head, int tail) 
    {
    if (head >= tail || arr == null || arr.length <= 1) 
    {
    return;
    }
    int i = head, j = tail, pivot = arr[(head + tail) / 2];
    while (i <= j) 
    {
    while (arr[i] < pivot) 
    {
    ++i;
    }
    while (arr[j] > pivot) 
    {
    --j;
    }
    if (i < j) 
    {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
    ++i;
    --j;
    } else if (i == j) 
    {
    ++i;

    }
    }
    quickSort(arr, head, j);
    quickSort(arr, i, tail);
    }

     */
    /*
    public class Quicksort{

        /*

        It helps us to finish the part that put small one on the right and put large one on the left depend on pivot       

         */

/*        public static int partition(int arr[], int left, int right){

            int I = left, j = right;//get I & j

            int tmp;//temporarily store int

            int pivot = arr[(left + right) / 2];//get middle number(not necessary)  

            while (I <= j) {//keep searching until I > j, which means that they already check all the elements

                //keep searching until find number that is smaller than pivot

                while (arr[I] < pivot)

                    I++;

                //keep searching until find number that is larger than pivot

                while (arr[j] > pivot)

                    j--;

                if (I <= j) {//make sure they does not check the element that they already check all the elements

                    //swap these two elements

                    tmp = arr[I];

                    arr[I] = arr[j];

                    arr[j] = tmp;

                    //go to next one

                    I++;

                    j--;

                }

            }

            //return the index(the number that has the right position)

            return I;//both I and j is ok

        }
*/
        /*

        It helps us to do the partition and do the partition for another two part.

         */

      /*  public static void quicksort(int arr[], int left, int right) {

            int index = partition(arr, left, right);//do the partition

            if (left < index - 1)//do the partition to the left part if the new left and new right not coincide

                quicksort(arr, left, index - 1);

            if (index < right)//do the partition to the right part if the new left and new right not coincide

                quicksort(arr, index, right);

        }


        public static int[] main(int[] arr){

            quicksort(arr,0,arr.length - 1);

            return arr;

        }

    }
    
    */

}
