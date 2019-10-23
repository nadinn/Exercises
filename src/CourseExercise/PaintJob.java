package CourseExercise;

/**
 * program to calculate the number of buckets of paint needed by a painter giver the width
 * height, area that a bucket can cover and any extra buckets the painter might have
 */
public class PaintJob {
    public static void main(String[] args) {
        System.out.println("buckets : "+ getBucketCount(2.75 ,3.25, 2.5, 1 ));
        System.out.println("buckets : "+ getBucketCount(7.25, 4.3,2.35));

    }

    /**
     *
     * @param width
     * @param height
     * @param areaPerBucket
     * @param extraBuckets
     * @return number of buckets the painter needs to buy keeping in consideration the extra buckets
     */
    public static int  getBucketCount(double width, double height, double areaPerBucket, int extraBuckets ){
        if (width<=0 || height <=0 || areaPerBucket<= 0 || extraBuckets<0){
            System.out.println("invalid input");
            return -1;
        } else{
            double area = width*height;
            double numberOfBuckets = area/ areaPerBucket;
           numberOfBuckets = Math.ceil(numberOfBuckets);
           int actualBuckets = (int)numberOfBuckets-extraBuckets;
           return actualBuckets ;
        }

    }

    /**
     *
     * @param width
     * @param height
     * @param areaPerBucket
     * @return number of buckets the painter needs to buy when he has 0 extra buckets
     */

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width<=0 || height <=0 || areaPerBucket<= 0){
            System.out.println("invalid input");
            return -1;
        } else{
            double area = width*height;
            double numberOfBuckets = area/ areaPerBucket;
            numberOfBuckets = Math.ceil(numberOfBuckets);
            return (int)numberOfBuckets;
        }

    }
}
