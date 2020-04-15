package vn.edu.hust.baitapgmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.bloco.faker.Faker;

public class MainActivity extends AppCompatActivity {

    List<ContactModel> contacts;
    Faker faker = new Faker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList<>();
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));
        contacts.add(new ContactModel(faker.name.name(), R.drawable.thumb1, true,faker.lorem.paragraph()));

        ContactAdapter adapter = new ContactAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
