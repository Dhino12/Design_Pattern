## Facade Pattern
![images/Repository.png](Repository)
<br>
Di sini Repository berperan sebagai facade. Sehingga ketika ViewModel ingin mengambil
data dari datasource, cukup kode yang simpel seperti repository.getData() atau
repository.getFavoriteData(). ViewModel tidak perlu tahu bagaimana cara mendapatkan
data tersebut. Apakah dari data remote atau dari data local, cukup dengan memanggil
fungsi itu saja.