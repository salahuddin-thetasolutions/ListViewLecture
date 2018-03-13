package solutions.theta.listviewlecture.Model;

/**
 * Created by SALAHUDIN` on 3/13/2018.
 */

public class User {
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getDrawableImage() {
        return DrawableImage;
    }

    public void setDrawableImage(int drawableImage) {
        DrawableImage = drawableImage;
    }

    String FirstName;
    String LastName;
    int DrawableImage;
}
