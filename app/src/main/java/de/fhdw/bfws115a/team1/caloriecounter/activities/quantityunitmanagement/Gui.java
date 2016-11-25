package de.fhdw.bfws115a.team1.caloriecounter.activities.quantityunitmanagement;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.fhdw.bfws115a.team1.caloriecounter.R;

/**
 * Created by Florian on 08.11.2016.
 */
public class Gui {

    private ImageView mAddNewQuantityUnit;
    private ImageView mDeleteQuantityUnit;


    public Gui(Init activity) {
        /* ID´s müssen noch vom Layout zugewiesen werden! */
        activity.setContentView(R.layout.quantityunitmanagement);

        mAddNewQuantityUnit = (ImageView) activity.findViewById(R.id.idAddNewQuantityUnit);
        mDeleteQuantityUnit = (ImageView) activity.findViewById(R.id.idDeleteQuantityUnit);
    }

    /* Getter methods */
    public ImageView getAddNewQuantityUnit() {
        return mAddNewQuantityUnit;
    }

    public ImageView getDeleteQuantityUnit() {
        return mDeleteQuantityUnit;
    }

    /* Other methods */
}


