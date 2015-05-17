package fr.gi.utbm.lo53project;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/**
 * Created by celian on 05/05/15 for LO53Project
 */
public class CalibrationViewport extends AbstractViewport {

    public CalibrationViewport(Context context, AttributeSet attrs, WorldMap map, SelectionListener listener) {
        super(context, attrs, map, listener);
    }

    @Override
    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);

        for (Position p : mMap.getPositionsOfType(Position.Type.CALIBRATION)) {
            canvas.drawPoint(p.x, p.y, mMap.paints.get(p.type));
        }
    }
}