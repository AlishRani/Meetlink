import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseInitializer {
    public static void initializeFirebase() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("path/to/serviceAccountKey.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://your-database-url.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        System.out.println("Firebase Initialized");
    }
}
