package com.chan.testapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Adapter extends PagerAdapter {
    private Context context;
    public int[] images = new int[]{C0273R.drawable.library, C0273R.drawable.hospital, C0273R.drawable.park, C0273R.drawable.governmentoffice, C0273R.drawable.police, C0273R.drawable.bank, C0273R.drawable.museum};
    private LayoutInflater inflater;

    class C02551 implements OnClickListener {
        C02551() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(".SecondActivity");
            intent.putExtra("num", 0);
            Adapter.this.context.startActivity(new Intent(intent));
        }
    }

    class C02562 implements OnClickListener {
        C02562() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(".SecondActivity");
            intent.putExtra("num", 1);
            Adapter.this.context.startActivity(new Intent(intent));
        }
    }

    class C02573 implements OnClickListener {
        C02573() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(".SecondActivity");
            intent.putExtra("num", 2);
            Adapter.this.context.startActivity(new Intent(intent));
        }
    }

    class C02584 implements OnClickListener {
        C02584() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(".SecondActivity");
            intent.putExtra("num", 3);
            Adapter.this.context.startActivity(new Intent(intent));
        }
    }

    class C02595 implements OnClickListener {
        C02595() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(".SecondActivity");
            intent.putExtra("num", 4);
            Adapter.this.context.startActivity(new Intent(intent));
        }
    }

    class C02606 implements OnClickListener {
        C02606() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(".SecondActivity");
            intent.putExtra("num", 5);
            Adapter.this.context.startActivity(new Intent(intent));
        }
    }

    class C02617 implements OnClickListener {
        C02617() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(".SecondActivity");
            intent.putExtra("num", 6);
            Adapter.this.context.startActivity(new Intent(intent));
        }
    }

    public Adapter(Context context) {
        this.context = context;
    }

    public int getCount() {
        return this.images.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    public Object instantiateItem(ViewGroup container, int position) {
        this.inflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        View v = this.inflater.inflate(C0273R.layout.slider, container, false);
        ImageButton imageView = (ImageButton) v.findViewById(C0273R.id.imageView);
        imageView.setImageResource(this.images[position]);
        switch (position) {
            case 0:
                imageView.setOnClickListener(new C02551());
                break;
            case 1:
                imageView.setOnClickListener(new C02562());
                break;
            case 2:
                imageView.setOnClickListener(new C02573());
                break;
            case 3:
                imageView.setOnClickListener(new C02584());
                break;
            case 4:
                imageView.setOnClickListener(new C02595());
                break;
            case 5:
                imageView.setOnClickListener(new C02606());
                break;
            case 6:
                imageView.setOnClickListener(new C02617());
                break;
        }
        container.addView(v);
        return v;
    }

    public void destroyItem(ViewGroup pager, int position, Object object) {
        pager.invalidate();
    }
}
