package model;
public class UserAccount {
	//Attributes
	private String userName = "";
	private String password = "";
	private String profilePhoto = "";
	private boolean gender = false;
	private boolean career = false;
	private String birthday = "";
	private boolean browser = false;
	//Methods
	public UserAccount(String pUserName, String pPassword, String pProfilePhoto, boolean pGender, boolean pCareer, String pBirthday, boolean pBrowser) {
		userName = pUserName;
		password = pPassword;
		profilePhoto = pProfilePhoto;
		gender = pGender;
		career = pCareer;
		birthday = pBirthday;
		browser = pBrowser;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getProfilePhoto(){
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto){
		this. profilePhoto = profilePhoto;
	}
	public boolean getGender(){
		return gender;
	}
	public void setGender(boolean gender){
		this.gender = gender;
	}
	public boolean getCareer(){
		return career;
	}
	public void setCareer(boolean career){
		this.career = career;
	}
	public String getBirthday(){
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public boolean getBrowser(){
		return browser;
	}
	public void setBrowser(boolean browser){
		this.browser = browser;
	}
}
