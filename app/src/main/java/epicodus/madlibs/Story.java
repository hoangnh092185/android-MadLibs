package epicodus.madlibs;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Guest on 11/15/16.
 */
public class Story implements Parcelable {
    String Occupation;
    String Noun1;
    String Noun2;
    String Noun3;
    String Noun4;
    String Adjective1;
    String Adjective2;
    String Verb1;
    String Verb2;
    String Verb3;

    public Story(String Occupation,
            String Noun1,
            String Noun2,
            String Noun3,
            String Noun4,
            String Adjective1,
            String Adjective2,
            String Verb1,
            String Verb2,
            String Verb3) {
        this.Occupation = Occupation;
        this.Noun1 = Noun1;
        this.Noun2 = Noun2;
        this.Noun3 = Noun3;
        this.Noun4 = Noun4;
        this.Adjective1 = Adjective1;
        this.Adjective2 = Adjective2;
        this.Verb1 = Verb1;
        this.Verb2 = Verb2;
        this.Verb3 = Verb3;
    }

    public Story(Parcel in) {
        String[] data = new String[10];
        in.readStringArray(data);
        this.Occupation = data[0];
        this.Noun1 = data[1];
        this.Noun2 = data[2];
        this.Noun3 = data[3];
        this.Noun4 = data[4];
        this.Adjective1 = data[5];
        this.Adjective2 = data[6];
        this.Verb1 = data[7];
        this.Verb2 = data[8];
        this.Verb3 = data[9];
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {        this.Occupation,
        this.Noun1,
        this.Noun2,
        this.Noun3,
        this.Noun4,
        this.Adjective1,
        this.Adjective2,
        this.Verb1,
        this.Verb2,
        this.Verb3});
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Story createFromParcel(Parcel in) {
            return new Story(in);
        }

        public Story[] newArray(int size) {
            return new Story[size];
        }
    };
}
