package ca.ulaval.ima.tp1;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Calendar;

public class Profile implements Parcelable {
    private String first_name;
    private String name;
    private Calendar birthday;
    private String idul;

    public Profile(String first_name, String name, Calendar birthday, String idul) {
        this.first_name = first_name;
        this.name = name;
        this.birthday = birthday;
        this.idul = idul;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.first_name);
        dest.writeString(this.name);
        dest.writeSerializable(this.birthday);
        dest.writeString(this.idul);
    }


    protected Profile(Parcel in) {
        this.first_name = in.readString();
        this.name = in.readString();
        this.birthday = (Calendar) in.readSerializable();
        this.idul = in.readString();
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String getIdul() {
        return idul;
    }

    public void setIdul(String idul) {
        this.idul = idul;
    }

    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>() {
        @Override
        public Profile createFromParcel(Parcel source) {
            return new Profile(source);
        }

        @Override
        public Profile[] newArray(int size) {
            return new Profile[size];
        }
    };
}
