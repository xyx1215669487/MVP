package com.example.presenter;

import com.example.model.IUserModel;
import com.example.model.User;
import com.example.model.UserModel;
import com.example.view.IUserView;

public class UserPresenter {

	private IUserModel mIUserModel;
	
	private IUserView mIUserView;
	
	public UserPresenter(IUserView userView) {
		// TODO Auto-generated constructor stub
		mIUserView=userView;
		mIUserModel=new UserModel();
	}
	
	public void saveUser(int id,String firstName,String loadName){
		mIUserModel.setId(id);
		mIUserModel.setFirstName(firstName);
		mIUserModel.setLoadName(loadName);
	}
	
	public void LoadUser(int id){
		User user=mIUserModel.Load(id);
		mIUserView.setFirstName(user.getFirstName());
		mIUserView.setLoadName(user.getLoadName());
		
	}
}
