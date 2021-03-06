package de.fhdw.bfws115a.team1.caloriecounter.activities.quantityunitmanagement;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import de.fhdw.bfws115a.team1.caloriecounter.R;
import de.fhdw.bfws115a.team1.caloriecounter.database.DatabaseUnit;

/**
 * @author Florian Obladen.
 */

public class ListViewHolder {

    /* Member variables */
    private ApplicationLogic mApplicationLogic;
    private ListButtonClickListener mListButtonClickListener;
    private TextView mNameText;
    private ImageView mDeleteImage;
    private DatabaseUnit mDatabaseUnit;

    /**
     * Connects view elements from frontend with backend variables.
     * Reasons are modifying options in backend later on.
     *
     * @param view             The view where the elements are in.
     * @param applicationLogic ApplicationLogic instance.
     */

    public ListViewHolder(View view, ApplicationLogic applicationLogic) {
        mApplicationLogic = applicationLogic;
        mDatabaseUnit = null;

        mNameText = (TextView) view.findViewById(R.id.idQuantityUnitManagementRowAddNewQuantityUnit);
        mDeleteImage = (ImageView) view.findViewById(R.id.idQuantityUnitManagementRowDeleteQuantityUnit);

        mListButtonClickListener = new ListButtonClickListener(mApplicationLogic, mDatabaseUnit);
        mDeleteImage.setOnClickListener(mListButtonClickListener);
    }

    /* Setter methods */
    public void setDatabaseUnit(DatabaseUnit databaseUnit) {
        mListButtonClickListener.setDatabaseUnit(databaseUnit);
    }

    /* Getter methods */
    public TextView getNameText() {
        return mNameText;
    }

    public ImageView getDeleteImage() {
        return mDeleteImage;
    }
}