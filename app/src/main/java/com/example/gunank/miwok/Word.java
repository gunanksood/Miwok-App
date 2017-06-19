package com.example.gunank.miwok;

/**
 * Created by gunank on 8/6/17.
 */

public class Word {

    /** Default translation for the word */

    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String miwokTranslation;

    private int mimage_id;
    private int mmusic_id;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int musicid) {
        mDefaultTranslation = defaultTranslation;
        miwokTranslation = miwokTranslation;
        mmusic_id = musicid;
    }
    public Word(String default_trans, String miwok, int imageid, int musicid)
    {
        mDefaultTranslation = default_trans;
        miwokTranslation = miwok;
        mimage_id = imageid;
        mmusic_id = musicid;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getimageid()
    {
        return mimage_id;
    }
    public int getmusicid() { return mmusic_id; }

}