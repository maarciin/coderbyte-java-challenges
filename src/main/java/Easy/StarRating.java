package Easy;

/*
Have the function StarRating(str) take the str parameter being
passed which will be an average rating between 0.00 and 5.00,
and convert this rating into a list of 5 image names to be displayed
in a user interface to represent the rating as a list of stars and half stars.
Ratings should be rounded to the nearest half. There are 3 image file names available:
"full.jpg", "half.jpg", "empty.jpg".
The output will be the name of the 5 images (without the extension),
from left to right, separated by spaces.
For example: if str is "2.36" then this should be displayed by the following image:

So your program should return the string "full full half empty empty".
Examples
Input: "0.38"
Output: half empty empty empty empty
Input: "4.5"
Output: full full full full half
 */
class StarRating {
    public static void main(String[] args) {
        System.out.println(starRating("2.36"));
        System.out.println(starRating("0.38"));
        System.out.println(starRating("4.5"));
    }

    public static String starRating(String str) {
        double rating = Double.parseDouble(str);
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < 5; count++) {
            if (rating >= 1.0) {
                sb.append("full ");
                rating -= 1.0;
            } else if (rating == 0) {
                sb.append("empty ");
            } else {
                sb.append(rating < 0.25 ? "empty " : rating < 0.75 ? "half " : "full ");
                rating = 0;
            }
        }
        return sb.toString().trim();
    }
}
