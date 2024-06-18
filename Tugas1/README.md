# 📝 Tugas 1 : Mengulang Materi PEMDAS

## 💼 Studi Kasus

Kamu baru saja diterima sebagai developer magang di suatu perusahaan bernama PT Ryon Sentosa. Sebagai developer magang, kamu dikasih tugas ringan oleh Dino senpai. 
Dino senpai memberikan kamu dua opsi dimana kamu akan memilih salah satu opsi sebagai tugas pertama kamu, yaitu : 
1. Membuat program yang meniru salah satu fitur dari aplikasi / website / game yang ada
2. Membuat program yang meniru sistem informasi yang ada dengan mengambil minimal 3 fitur 

Sebagai contoh, untuk nomor 1, kamu bisa membuat program autentikasi pengguna, untuk nomor 2, kamu bisa membuat program yang meniru SIAM UB beserta 3 fitur yang ada dalam SIAM UB.

Dino senpai memberikan catatan bahwa apabila kamu memilih nomor 2, maka kamu akan mendapatkan poin bonus sebesar (**+25 Points**) sehingga kesempatan kamu untuk menjadi developer tetap semakin tinggi.

Dino senpai juga memberikan bebereapa requirement dan optional requirement yand dijabarkan sebagai berikut.

### ✅ Must Requirements
1. Program memanfaatkan konsep Input Output 
2. Program memanfaatkan konsep Conditional 
3. Program memanfaatkan konsep Looping 
4. Program memanfaatkan konsep Static Array 
5. Program memanfaatkan konsep Method 

### 👌 Optional Requirements
1. Program memiliki method rekursif yang *meaningful* dalam artian tidak sekedar yang penting ada (**+5 Points**)
2. Program bisa membaca dan menulis (Read/Write) data dari sebuah file. Extensi file harus ```.txt``` (**+10 Points**)
3. Kode program harus ditulis dengan dasar ```clean code``` (**+10 Points**)

Untuk submisi tugas ini, clean code hanya terbatas pada : 
- [Java Naming Convention](https://www.javatpoint.com/java-naming-conventions)
- Consistent Curly Braces and Identation

More explanation on clean code:
```java
public class TodoRepository { // follows java naming convention (PascalCase for class's name)

    private final MysqlDB db; // for constants, the variable must be all capital letters

    public static Todo[] fetchTodos() // inconsistent curly braces
    {

    }

    public static Error insertTodo() { // consistent curly braces

    }

    public static Todo fetch_todo_by_id(int id) { // the method's name is not camel case
        Todo todo = db.query("SELECT * FROM todos WHERE id = ?", id);

            return todo; // inconsistent identation
    }
}
```

## ⏳ Deadline

Dino senpai yang baik hati memberikan deadline 7 hari sejak tugas ini dipublish di classroom.

## 📤 Pengumpulan

- Buatlah video berisi penjelasan mengenai program yang kamu buat lalu upload ke youtube dan batasi videonya hanya yang memiliki link yang dapat melihat
- Maksimal durasi video adalah 20 menit
- Fork Repository ini dan beri nama forked repositorynya dengan format ```Nama Panggilan-PBO-PTI-A```
- Bikin folder baru dalam folder Tugas 1 dan beri nama folder tersebut ```NIM - Nama Panggilan```
- Upload hasil tugas kamu beserta dengan file README.md yang memiliki isi dengan [template yang sudah ditentukan](./22xxx%20-%20Devan/README.md) ke dalam folder yang telah kamu baru buat
- Setelah submisi kamu sudah terupload, kumpulkan link repository milik kamu (yang di fork) ke classroom

## NOTES 
- Jangan ganti branchnya
- Apabila kamu ingin membuat file ```.gitignore```, letakkan di folder kamu upload tugas

## 💯 Total Bonus Points
Apabila kamu mengikuti semua aspek bonus yaitu mengerjakan opsi 2 dan memenuhi semua optional requirements, maka akan mendapatkan poin bonus sebesar **50 poin** yang bisa membantu kamu dalam penilaian tengah praktikum atau penilaian akhir praktikum

## 👥 Contacts

Apabila masih kebingngan dengan tugas ini silahkan menghubungi asisten praktikum, ganbatee!!!

![gif](https://media1.tenor.com/m/USdY6pi_97gAAAAC/anime-bocchi.gif)
