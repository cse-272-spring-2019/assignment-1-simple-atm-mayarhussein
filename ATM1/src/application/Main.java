package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			primaryStage.setTitle("ATM");
			BorderPane root = new BorderPane();
			
			
			ATMClient client1 = new ATMClient("12244", "7777",0);
			
			//Scene1  
			
			GridPane layout1= new GridPane();
			Scene scene1 = new Scene(layout1,400,400);
			layout1.setPadding(new Insets(10,10,10,10));
			layout1.setVgap(8);
			layout1.setHgap(10);
			
			
			
			
			  
			//Scene2
			
			GridPane layout2= new GridPane();
			Scene scene2 = new Scene(layout2,400,400);
			layout2.setPadding(new Insets(10,10,10,10));
			layout2.setVgap(8);
			layout2.setHgap(10);
			
			//Scene3 for Deposit
			
			GridPane layout3= new GridPane();
			Scene scene3 = new Scene(layout3,400,400);
			layout3.setPadding(new Insets(10,10,10,10));
			layout3.setVgap(8);
			layout3.setHgap(10);
			
			//Scene 4 for Withdraw
			
			GridPane layout4= new GridPane();
			Scene scene4 = new Scene(layout4,400,400);
			layout4.setPadding(new Insets(10,10,10,10));
			layout4.setVgap(8);
			layout4.setHgap(10);
			 
			
			//Scene5 for Showing the Balance 
			
			GridPane layout5= new GridPane();
			Scene scene5 = new Scene(layout5,400,400);
			layout5.setPadding(new Insets(10,10,10,10));
			layout5.setVgap(8);
			layout5.setHgap(10);
			
			
			// Scene 6 for Transaction History
			
			GridPane layout6= new GridPane();
			Scene scene6 = new Scene(layout6,400,400);
			layout6.setPadding(new Insets(10,10,10,10));
			layout6.setVgap(8);
			layout6.setHgap(10);
			
			
			// Fields
			
						TextField txt1 = new TextField();
						GridPane.setConstraints(txt1,0, 1);
						
						PasswordField txt2= new PasswordField();
						GridPane.setConstraints(txt2,1, 1);
						txt2.setPromptText("password");
						
						TextField txt3 = new TextField();
						GridPane.setConstraints(txt3,0, 1);
						txt3.setPromptText("$00.00");
						
						TextField txt4 = new TextField();
						GridPane.setConstraints(txt4,0, 1);
						txt4.setPromptText("$00.00");
						
						
						
						// Labels
						
						Label lb1 = new Label("Account Number");
						GridPane.setConstraints(lb1,0, 0);
						
						Label lb2 = new Label("Password");
						GridPane.setConstraints(lb2,1, 0);
						
						Label lb3= new Label("Enter the amount of money: ");
						GridPane.setConstraints(lb3,0, 0);
						
						Label lb4= new Label("Enter the amount of money: ");
						GridPane.setConstraints(lb4,0, 0); 
						
						Label lb5= new Label("Your current balance is:  ");
						GridPane.setConstraints(lb5,0, 0); 
						
						Label lb6= new Label();
						GridPane.setConstraints(lb6,0, 2); 
						
						Label lb7= new Label();
						GridPane.setConstraints(lb7,0, 2); 
						
						Label lb8= new Label();
						GridPane.setConstraints(lb8,0, 1); 
						
						
						Label lb9=new Label();
						GridPane.setConstraints(lb9,0, 1); 
						
						Label lb10=new Label();
						GridPane.setConstraints(lb10,0, 4); 
						
						Label lb11=new Label();
						GridPane.setConstraints(lb11,0, 4); 
						
						
			
			// BUTTONS
			
			Button login = new Button("log In");
			GridPane.setConstraints(login,0, 7);
			login.setOnAction(e -> {
				String accNum= txt1.getText();
				String password=txt2.getText();
				if (client1.check(accNum,password))
					primaryStage.setScene(scene2);
				else
					Alert.displayAlert("Invalid account number or password!");
		});
			
			Button exit  = new Button("Exit");
			GridPane.setConstraints(exit,1,7);
			exit.setOnAction(e-> primaryStage.close());
			
			Button deposit = new Button("Deposit");
			GridPane.setConstraints(deposit,1, 1);
			deposit.setOnAction(e -> primaryStage.setScene(scene3));
			
			Button withdraw = new Button("Withdraw");
			GridPane.setConstraints(withdraw,1, 5);
			withdraw.setOnAction(e -> primaryStage.setScene(scene4));
			
			Button showBalance= new Button("Show Balance");
			GridPane.setConstraints(showBalance,5, 1);
			showBalance.setOnAction(e -> primaryStage.setScene(scene5));
			
		
		
			
			Button next= new Button("Show Next");
			GridPane.setConstraints(next,1, 7);
			
			next.setOnAction(e->lb9.setText(client1.next()));
			
			Button prev= new Button("Show Previous");
			GridPane.setConstraints(prev,0, 7);
			
			prev.setOnAction(e->lb9.setText(client1.previous()));
			
			
			Button transHistory= new Button("Transaction History");
			GridPane.setConstraints(transHistory,5, 5);
			transHistory.setOnAction(e ->primaryStage.setScene(scene6));
			
			Button back1 = new Button("Back");
			GridPane.setConstraints(back1,7, 7);
			back1.setOnAction(e -> primaryStage.setScene(scene2));
			
			Button back2 = new Button("Back");
			GridPane.setConstraints(back2,7, 7);
			back2.setOnAction(e -> primaryStage.setScene(scene2));
			
			Button back3 = new Button("Back");
			GridPane.setConstraints(back3,7, 7);
			back3.setOnAction(e -> primaryStage.setScene(scene2));
			
			Button back4 = new Button("Back");
			GridPane.setConstraints(back4,7, 7);
			back4.setOnAction(e -> primaryStage.setScene(scene2));
			
			Button logout = new Button("log Out");
			GridPane.setConstraints(logout,5, 7);
			logout.setOnAction(e -> primaryStage.setScene(scene1));
			
			
			Button deposit2= new Button("Deposit");
			GridPane.setConstraints(deposit2,1, 7);
			deposit2.setOnAction(e->{
				String amount=txt3.getText();
				try {
					double d=Double.parseDouble(amount);
					if (d<0)
						Alert.displayAlert("Can NOT deposit a negative amount");
					else{
					client1.deposit(d);
					lb6.setText("You deposited $"+ String.valueOf(d)+" Thank You!");
					lb10.setText("Your current balance is $"+client1.getBalance());
					} 
				}
					catch(Exception x) {
					Alert.displayAlert("Invalid! can not enter CHARACTERS");
					}
		            txt3.clear();
						});
			
			Button withdraw2= new Button("withdraw");
			GridPane.setConstraints(withdraw2,1, 7);
			withdraw2.setOnAction(e->{
				String amount=txt4.getText();
				try {
				double d= Double.parseDouble(amount);
				 if(d<0) 
						Alert.displayAlert("Can NOT withdraw a negative amount");
				 else if(client1.getBalance()>=d && d>0) {
					 client1.withdraw(d);
					lb7.setText("You withdrew $" + String.valueOf(d)+" Thank You!");
					lb11.setText("Your current balance is $"+client1.getBalance());
					}
				 else
					 Alert.displayAlert("Insufficient balance amount!"); 
			}
				catch(Exception x) {
					Alert.displayAlert("Invalid! can not enter CHARACTERS");
				}
		        txt4.clear();
			});

		
		
			
			Button showBalance2= new Button("Show Balance");
			GridPane.setConstraints(showBalance2,5, 1);
			showBalance2.setOnAction(e ->lb8.setText(String.valueOf(client1.getBalance())));
		
			
			
			
			
			
			
			layout1.getChildren().addAll(login, exit, txt1, txt2, lb1, lb2);
			layout2.getChildren().addAll( deposit, withdraw,showBalance,transHistory, logout);
			layout3.getChildren().addAll(back1,lb3,txt3,deposit2,lb6,lb10);
			layout4.getChildren().addAll(back2,lb4,txt4,withdraw2, lb7,lb11);
			layout5.getChildren().addAll(back3,showBalance2,lb5, lb8);
			layout6.getChildren().addAll(next, prev, back4,lb9);
			
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene1);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handle(ActionEvent event)
	{
		
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
