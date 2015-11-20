package com.kyleduo.mdialog.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by kyle on 15/8/14.
 * updated by bajian 15-11-20
 * fix: iscancellable
 * edit: padding and btn color
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

	private static String[] sContents = new String[]{"Default style", "Custom stye"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView listView = (ListView) findViewById(android.R.id.list);
		listView.setAdapter(new ArrayAdapter<>(this,
				android.R.layout.simple_list_item_1,
				android.R.id.text1,
				sContents));

		listView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		switch (position) {
			case 0:
				startActivity(new Intent(this, CompareActivity.class));
				break;

			case 1:
				startActivity(new Intent(this, CustomActivity.class));
				break;


		}
	}
}
