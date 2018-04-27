package hr.ferit.bruno.exercise1.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hr.ferit.bruno.exercise1.R;
import hr.ferit.bruno.exercise1.TasksRepository;
import hr.ferit.bruno.exercise1.model.Task;
import hr.ferit.bruno.exercise1.persistance.FakeDatabase;

public class MainActivity extends AppCompatActivity {

	@BindView(R.id.textview_newtask_title) TextView textview_newtask_title ;
	@BindView(R.id.edittext_newtask_title) EditText edittext_newtask_title;
	@BindView(R.id.textview_newtask_summary) TextView textview_newtask_summary;
	@BindView(R.id.edittext_newtask_summary) EditText edittext_newtask_summary;
	@BindView(R.id.textview_newtask_importance) TextView textview_newtask_importance;
	@BindView(R.id.edittext_newtask_importance) EditText edittext_newtask_importance;
	@BindView(R.id.button_newtask_save) Button button_newtask_save;
	@BindView(R.id.textview_newtask_display) TextView textview_newtask_display;

	TasksRepository mRepository;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		mRepository = TasksRepository.getInstance();
	}

	@SuppressLint("DefaultLocale")
    public void saveTask(View view){

		// ToDo: 	store the task
		// Parse data from the widgets and store it in a task
		// Store the task in the fake database using the repository

		int importance = Integer.parseInt(edittext_newtask_importance.getText().toString());
		String title = this.edittext_newtask_title.getText().toString();
		String summary = this.edittext_newtask_summary.getText().toString();

        Task task = new Task(importance,title,summary);
        mRepository.save(task);

		// ToDo:	clear the UI for the new task
		// Clear all of the editText controls
		edittext_newtask_importance.setText("");
        edittext_newtask_title.setText("");
        edittext_newtask_summary.setText("");

		// ToDo: 	define a method
		// Create a method for displaying the tasks in the textview as strings
		// one below the other and call it on each new task.

		textview_newtask_display.setText(String.format("%s%s%d","\n"+task.getTitle()+"\n",task.getSummary()+"\n",task.getImportance()));

	}
}
