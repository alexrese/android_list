package com.example.alexrese.listpeople;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView lvContact;
    private ContactListAdapter adapter;
    private List<Contact> mContactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = (ListView) findViewById(R.id.listview_contact);

        mContactList = new ArrayList<>();

        mContactList.add(new Contact(1, "Albert Einstein", 99999999, "einstein@fisica.com"));
        mContactList.add(new Contact(2, "Quentin Tarantino", 888888888, "quentarantino@miramax.com"));
        mContactList.add(new Contact(3, "Michael Crichton ", 777777777, "mc@jurrasic.com"));
        mContactList.add(new Contact(4, "Bruce Dickinson", 666666666, "mei_dei@mei_dei.com"));
        mContactList.add(new Contact(5, "Martin Luther King Jr.", 555555555, "martin@luther.com"));
        mContactList.add(new Contact(6, "Arthur Conan Doyle", 444444444, "arthurconandoyle@doyle.com"));
        mContactList.add(new Contact(7, "Sherlock Holmes", 333333333, "sherlock@lock.com"));
        mContactList.add(new Contact(8, "Marilyn Monroe", 222222222, "marilyn@monroe.com"));
        mContactList.add(new Contact(9, "Mohandas Karamchand Gandhi", 111111111, "noemail@gandhi.com"));
        mContactList.add(new Contact(10, "Gautama Buddha", 101010101, "gautama@gautama.com"));
        mContactList.add(new Contact(11, "Carl Jung", 110110110, "jung@jung.com"));
        mContactList.add(new Contact(12, "Fritjof Capra", 121212121, "fritjof@capra.com"));
        mContactList.add(new Contact(13, "Elvis Presley", 131313131, "elvis@presley.com"));

        adapter = new ContactListAdapter(getApplicationContext(), mContactList);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked contact id = " + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
