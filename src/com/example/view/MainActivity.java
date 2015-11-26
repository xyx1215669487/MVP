package com.example.view;

import com.example.mvptest.R;
import com.example.presenter.UserPresenter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener,IUserView{
	
	private EditText mFirstName,mLoadName,mID;
	
	private Button mBtnSave,mBtnGet;
	
	private UserPresenter mUserPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mFirstName=(EditText) findViewById(R.id.edt_first);
		mLoadName=(EditText) findViewById(R.id.edt_load);
		mID=(EditText) findViewById(R.id.edt_id);
		mBtnSave=(Button) findViewById(R.id.btn_save);
		mBtnGet=(Button) findViewById(R.id.btn_get);
		mBtnSave.setOnClickListener(this);
		mBtnGet.setOnClickListener(this);
	}


	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return Integer.parseInt(mID.getText().toString());
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return mFirstName.getText().toString();
	}

	@Override
	public String getLoadName() {
		// TODO Auto-generated method stub
		return mLoadName.getText().toString();
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		mFirstName.setText(firstName);
	}

	@Override
	public void setLoadName(String loadName) {
		// TODO Auto-generated method stub
		mLoadName.setText(loadName);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_save:
			mUserPresenter.saveUser(getId(), getFirstName(), getLoadName());
			break;
			
		case R.id.btn_get:
			mUserPresenter.LoadUser(getId());
			break;
		}
	}
}
