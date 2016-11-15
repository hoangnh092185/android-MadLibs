package epicodus.madlibs;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Guest on 11/15/16.
 */
public class Story implements Parcelable {
    ArrayList<String> Occupations;
    ArrayList<String> Nouns;
    ArrayList<String> Adjectives;
    ArrayList<String> Verbs;

    public Story(ArrayList<String> Occupations, ArrayList<String> Nouns,
            ArrayList<String> Adjectives, ArrayList<String> Verbs) {
        this.Occupations = Occupations;
        this.Nouns = Nouns;
        this.Adjectives = Adjectives;
        this.Verbs = Verbs;
    }

    public Story(Parcel in) {
        this.Occupations = (ArrayList<String>) in.readSerializable();
        this.Nouns = (ArrayList<String>) in.readSerializable();
        this.Adjectives = (ArrayList<String>) in.readSerializable();
        this.Verbs = (ArrayList<String>) in.readSerializable();
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeSerializable(this.Occupations);
        out.writeSerializable(this.Nouns);
        out.writeSerializable(this.Adjectives);
        out.writeSerializable(this.Verbs);
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
