package id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.R;
import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler.ChordAdapter;

/**
 * Created by user on 17/11/2016.
 */

public class LaguFragment extends Fragment {

    LaguAdapter mIDataAdapter2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.lagu_fragment, null);

        RecyclerView rvLagu = (RecyclerView) v.findViewById(R.id.mRecyclerLagu);
        rvLagu.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rvLagu.setAdapter(new ChordAdapter(this.getActivity(), getLaguList()));


        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView rvChord = (RecyclerView) getView().findViewById(R.id.mRecyclerLagu);
        rvChord.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mIDataAdapter2 = new LaguAdapter(this.getActivity(), getLaguList());
        rvChord.setAdapter(mIDataAdapter2);
    }

    public ArrayList<Data> getLaguList() {
        ArrayList<Data> datas = new ArrayList<>();
        Data data = new Data("Mungkin Nanti", R.drawable.peterpan2, R.drawable.peterpan, "Peterpan",
                "C               Em  \n" +
                        " Saatnya tuk berkata \n" +
                        "F                        C \n" +
                        " Mungkin yang terakhir kalinya \n" +
                        "C                    Em \n" +
                        " Sudahlah lepaskan semua \n" +
                        "F                  C \n" +
                        " Kuyakin inilah waktunya \n" +
                        "\n" +
                        "Chorus \n" +
                        "G                       F        \n" +
                        " Mungkin saja kau bukan yang dulu lagi \n" +
                        "G                   F \n" +
                        " Mungkin saja rasa itu telah pergi \n" +
                        "\n" +
                        "                 C \n" +
                        "Dan mungkin bila nanti \n" +
                        "                 Em \n" +
                        "Kita kan bertemu lagi \n" +
                        "               F \n" +
                        "Satu pintaku jangan \n" +
                        "    G                C \n" +
                        "Kau coba tanyakan kembali \n" +
                        "                     Em \n" +
                        "Rasa yang ku tinggal mati \n" +
                        "               F \n" +
                        "Seperti hari kemarin \n" +
                        "             G \n" +
                        "Saat semua disini \n" +
                        "\n" +
                        "Musik :  C Em F G \n" +
                        "\n" +
                        "C                   Em \n" +
                        " Dan bila hatimu terbangun \n" +
                        "F                     C \n" +
                        " Bangun dari mimpi-mimpimu \n" +
                        "C                  Em \n" +
                        " Membuka hatimu yg dulu \n" +
                        "F                 C \n" +
                        " Cerita saat bersamaku \n" +
                        "\n" +
                        "back to chorus \n" +
                        "back to reff \n" +
                        "\n" +
                        "                      C \n" +
                        "Tak usah kau tanyakan lagi \n" +
                        "                Em \n" +
                        "Simpan untuk sendiri \n" +
                        "                     F \n" +
                        "Semua sesal yang kau cari \n" +
                        "                    G \n" +
                        "Semua rasa yang kau beri \n" +
                        "\n" +
                        "Musik :  C Em F G \n");
        datas.add(data);

        data = new Data("Merindukanmu", R.drawable.ddmasiv, R.drawable.dmasiv, "D'masiv",
                "Intro: C D\n" +
                        "\n" +
                        " C      F\n" +
                        "Saat aku tertawa diatas semua\n" +
                        "C F\n" +
                        "Saat aku menangisi kesedihanku\n" +
                        "\n" +
                        "Bridge:\n" +
                        "Am G F\n" +
                        "Aku ingin engkau selalu ada\n" +
                        "Am G F G\n" +
                        "Aku ingin engkau aku kenang\n" +
                        "\n" +
                        "reff:\n" +
                        "F C\n" +
                        "Selama aku masih bisa bernafas\n" +
                        "Dm\n" +
                        "masih sanggup berjalan\n" +
                        "G C\n" +
                        "ku kan slalu memujamu\n" +
                        "F \n" +
                        "meski ku tak tahu lagi\n" +
                        "C Am\n" +
                        "engkau ada dimana\n" +
                        "Dm G\n" +
                        "dengarkan aku ku merindukanmu\n" +
                        "\n" +
                        "Int:C F\n" +
                        "C F\n" +
                        "Saat aku mencoba merubah sgalanya\n" +
                        "C F\n" +
                        "Saat aku menangisi kekalahanku\n" +
                        "\n" +
                        "Back to: bridge, reff\n" +
                        "\n" +
                        "Int: Am Dm Em G Em\n" +
                        "\n" +
                        "Back to reff\n");
        datas.add(data);

        data = new Data("Ruang Rindu", R.drawable.lletto, R.drawable.letto, "Letto",
                "C            Dm   F    G        C   \n" +
                        "Di daun yang ikut mengalir lembut \n" +
                        "C          Dm     F       G \n" +
                        "Terbawa sungai ke ujung mata\n" +
                        "    C         Dm     F    G    C\n" +
                        "Dan aku mulai takut terbawa cinta \n" +
                        "C         Dm         F          G\n" +
                        "Menghirup rindu yang sesakkan dada\n" +
                        "\n" +
                        "Am   G     F      G          C \n" +
                        "Jalanku hampa dan ku sentuh dia, \n" +
                        "Am G      F   G          C  \n" +
                        "Terasa hangat di dalam hati\n" +
                        "Am   G     F       G        C     \n" +
                        "Kupegang erat dan kuhalangi waktu, \n" +
                        "Am    G     F     G           C \n" +
                        "Tak urung jua ku lihatnya pergi\n" +
                        "\n" +
                        "Interlude: D F Fm\n" +
                        "\n" +
                        "C            Dm         F    G   C\n" +
                        "Tak pernah kuragu dan selalu kuingat \n" +
                        "C           Dm        F           G   \n" +
                        "Kerlingan matamu dan sentuhan hangat\n" +
                        "C           Dm    F     G     C\n" +
                        "Ku saat itu takut mencari makna, \n" +
                        "C           Dm      F           G          \n" +
                        "Tumbuhkan rasa yang sesakkan dada\n" +
                        "\n" +
                        "\n" +
                        "    Am     G       F G        C\n" +
                        "Kau datang dan pergi begitu saja, \n" +
                        "Am     G     F  G        C\n" +
                        "Semua ku terima apa adanya\n" +
                        "Am   G     F      G        C     \n" +
                        "Mata terpejam dan hati menggumam, \n" +
                        "Am   G      F  G         C \n" +
                        "Di ruang rindu kita bertemu\n" +
                        "\n" +
                        "Interlude: Em F G Am G F C G D\n" +
                        "\n" +
                        "Coda: G F\n");
        datas.add(data);

        data = new Data("Jatuh Hati", R.drawable.rraisa, R.drawable.raisa, "Raisa",
                "[Intro] : C  F  C  F  C  F  C  F\n" +
                        "\n" +
                        "C                 F           C                       F\n" +
                        "Ada ruang hatiku yang kau temukan\n" +
                        "C                    F             C                   F\n" +
                        "Sempat aku lupakan kini kau sentuh\n" +
                        " Em    Am         Dm          F        Bb\n" +
                        "Aku bukan jatuh cinta namun aku jatuh hati\n" +
                        "  F                  G\n" +
                        "Heeyyy\n" +
                        "\n" +
                        "       C           Dm           C        F\n" +
                        "Ku terpikat pada tuturmu, aku tersihir dirimu\n" +
                        "         Am       G               Bb      F\n" +
                        "Terkagum pada pandangmu, caramu melihat dunia\n" +
                        "         C         Dm        C             F\n" +
                        "Ku harap kau tahu bahwa ku terinspirasi hatimu\n" +
                        "        Am         G\n" +
                        "Ku tak harus memilikimu\n" +
                        "       Bb          F            C\n" +
                        "Tapi bolehkah ku selalu di dekatmu\n" +
                        "\n" +
                        "[Interlude] : C  F  C  F\n" +
                        "\n" +
                        "C           F     C         F\n" +
                        "Ada ruang hatiku kini kau sentuh\n" +
                        "     Em    Am           Dm        F    Bb\n" +
                        "Aku bukan jatuh cinta namun aku jatuh hati...yeeeiyee..\n" +
                        "\n" +
                        "      C            Dm             C      F\n" +
                        "Ku terpikat pada tuturmu, aku tersihir dirimu\n" +
                        "          Am      G                Bb     F\n" +
                        "Terkagum pada pandangmu, caramu melihat dunia\n" +
                        "          C         Dm          C          F\n" +
                        "Ku harap kau tahu bahwa ku terinspirasi hatimu\n" +
                        "         Am      G\n" +
                        "Ku tak harus memilikimu\n" +
                        "       Bb          F            C\n" +
                        "Tapi bolehkah ku selalu di dekatmu\n" +
                        "\n" +
                        "Am        G             F        Am \n" +
                        "Katanya cinta, memang banyak bentuknya\n" +
                        " C       Em      Dm        F     Bb\n" +
                        "Ku tahu pasti sungguh aku jatuh hati\n" +
                        "  Am\n" +
                        "Hiiiiiiiii\n" +
                        "\n" +
                        "      D             Em           D        G\n" +
                        "Ku terpikat pada tuturmu, aku tersihir jiwamu\n" +
                        "          Bm      A                C      G\n" +
                        "Terkagum pada pandangmu, caramu melihat dunia\n" +
                        "     D             Em          D          G\n" +
                        "Ku harap kau tahu bahwa ku terinspirasi hatimu\n" +
                        "        Bm      A  \n" +
                        "Ku tak harus memilikimu\n" +
                        "       C           G                  C           G\n" +
                        "Tapi bolehkah ku selalu di dekatmu\n" +
                        "       C          G               \n" +
                        "Tapi bolehkah ku selalu di dekatmu\n");
        datas.add(data);

        data = new Data("Hingga Akhir Waktu", R.drawable.nnineball, R.drawable.nineball, "NineBall",
                "Intro : C G Am F Fm\n" +
                        "\n" +
                        "C                  G             Am\n" +
                        "Ku coba untuk melawan hati\n" +
                        "F                                         G\n" +
                        "Tapi hampa terasa di sini tanpamu\n" +
                        "C                 G                    Am\n" +
                        "Bagiku semua sangat berarti lagi\n" +
                        "F\n" +
                        "Kuingin kau disini\n" +
                        "Fm                              G\n" +
                        "Tepiskan sepiku bersamamu\n" +
                        "\n" +
                        "Reff :\n" +
                        "F                      G                   Am\n" +
                        "Tak kan pernah ada yg lain disisi\n" +
                        "F                      G             Am\n" +
                        "Segenap jiwa hanya untukmu\n" +
                        "F                     G                         Am\n" +
                        "Dan tak kan mungkin ada yg lain disisi\n" +
                        "F                                 Fm                            G\n" +
                        "Ku ingin kau disini tepiskan sepiku bersamamu\n" +
                        "\n" +
                        "C               G                  Am\n" +
                        "Bagiku semua sangat berarti\n" +
                        "F\n" +
                        "Kuingin kau disini\n" +
                        "C                   G                  Am\n" +
                        "Bagiku semua sangat berarti lagi\n" +
                        "F\n" +
                        "Kuingin kau disini\n" +
                        "\n" +
                        "Reff :\n" +
                        "F                   G                 Am\n" +
                        "Tak kan pernah ada yg lain disisi\n" +
                        "F                   G           Am\n" +
                        "Segenap jiwa hanya untukmu\n" +
                        "F                   G                     Am\n" +
                        "Dan tak kan mungkin ada yg lain disisi\n" +
                        "F                     Fm                                   G\n" +
                        "Ku ingin kau disini tepiskan sepiku bersamamu\n" +
                        "C G Am F Fm\n" +
                        "Hingga akhir waktu\n" +
                        "C G Am F Fm   C\n" +
                        "Hingga akhir waktu\n");
        datas.add(data);

        data = new Data("Laskar Pelangi", R.drawable.nnidji, R.drawable.nidji, "Nidji",
                "Intro : C F C F\n" +
                        "\n" +
                        "C                  F\n" +
                        "Mimpi adalah kunci\n" +
                        "C                                  F\n" +
                        "Untuk kita menaklukan dunia\n" +
                        "Em                     F\n" +
                        "Berlarilah tanpa lelah\n" +
                        "Em                          F\n" +
                        "Sampai engkau meraihnya\n" +
                        "\n" +
                        "C             F\n" +
                        "Laskar pelangi\n" +
                        "Em           F         G\n" +
                        "Takkan terikat waktu\n" +
                        "Am                              Em\n" +
                        "Bebaskan mimpimu diangkasa\n" +
                        "F                          G\n" +
                        "Warnai bintang dijiwa\n" +
                        "\n" +
                        "Reff :\n" +
                        "C                               F\n" +
                        "Menarilah dan terus tertawa\n" +
                        "C                               F\n" +
                        "Walau dunia tak seindah surga\n" +
                        "Am       F         C           G\n" +
                        "Bersyukurlah pada yang Kuasa\n" +
                        "Am           F       Dm              G\n" +
                        "Cinta kita didunia . . . . . selamanya\n" +
                        "\n" +
                        "Int : C F C F\n" +
                        "\n" +
                        "C                   F\n" +
                        "Cinta kepada hidup\n" +
                        "C                                F\n" +
                        "Memberikan senyuman abadi\n" +
                        "Dm                            Em\n" +
                        "Walau hidup kadang tak adil\n" +
                        "F                         G\n" +
                        "Tapi cinta lengkapi kita\n" +
                        "Dm Em F G\n" +
                        "oooouohhh. . . . .\n" +
                        "\n" +
                        "Bridge :\n" +
                        "Dm           Em        F         G\n" +
                        "Laskar pelangi takkan terikat waktu\n" +
                        "Dm            Em         F             G\n" +
                        "Jangan berhenti mewarnai jutaan mimpi dibumi\n" +
                        "\n" +
                        "back to reff\n" +
                        "\n" +
                        "C         F\n" +
                        "Selamanya\n" +
                        "C             F\n" +
                        "Laskar pelangi\n" +
                        "C                      F\n" +
                        "Takkan terikat waktu\n" +
                        "G       C\n" +
                        "uoohhhh. . . .\n");
        datas.add(data);

        data = new Data("Perahu Kertas", R.drawable.mmaudy, R.drawable.maudyayunda, "Maudy Ayunda",
                "[intro] F G F G Am \n" +
                        "\n" +
                        "Am                  F \n" +
                        "Perahu kertasku kan melaju \n" +
                        "E                   Am \n" +
                        "membawa surat cinta bagimu \n" +
                        "G                  Dm  \n" +
                        "Kata-kata yang sedikit gila \n" +
                        "E        Am \n" +
                        "tapi ini adanya \n" +
                        "\n" +
                        "                    F \n" +
                        "Perahu kertas mengingatkanku  \n" +
                        "E                 Am \n" +
                        "betapa ajaibnya hidup ini \n" +
                        "                   Dm \n" +
                        "Mencari-cari tambatan hati \n" +
                        "    E         Am \n" +
                        "kau sahabatku sendiri \n" +
                        "  G              \n" +
                        "Hidupkan lagi mimpi-mimpi \n" +
                        "F \n" +
                        "cinta-cinta... cita-cita ...  \n" +
                        "G \n" +
                        "cinta-cinta \n" +
                        "       Am                G \n" +
                        "yang lama ku pendam sendiri \n" +
                        "     Dm      C G    C   F G C \n" +
                        "berdua ku bisa percaya \n" +
                        "\n" +
                        "\n" +
                        "[chorus] \n" +
                        "   F       G                     C    G/B Am G \n" +
                        "Ku bahagia kau telah terlahir di dunia \n" +
                        "    F       G                  C    G/B  \n" +
                        "Dan kau ada di antara milyaran manusia \n" +
                        "    Am             F         G      C \n" +
                        "Dan ku bisa dengan radarku menemukanmu \n" +
                        "\n" +
                        "[int]  F G Am \n" +
                        "\n" +
                        "  F                 G \n" +
                        "Tiada lagi yang mampu berdiri \n" +
                        "     Am              Dm     E \n" +
                        "halangi rasaku, cintaku padamu \n" +
                        "\n" +
                        "\n" +
                        "[chorus] \n" +
                        "   F       G                     C    G/B Am G \n" +
                        "Ku bahagia kau telah terlahir di dunia \n" +
                        "    F       G                  C    G/B  \n" +
                        "Dan kau ada di antara milyaran manusia \n" +
                        "    Am             F         G       \n" +
                        "Dan ku bisa dengan radarku menemukanmu \n" +
                        "\n" +
                        "   Am  F   G                     C    G/B Am G \n" +
                        "Ku bahagia kau telah terlahir di dunia \n" +
                        "    F       G                  C    G/B  \n" +
                        "Dan kau ada di antara milyaran manusia \n" +
                        "    Am    G        F         G       \n" +
                        "Dan ku bisa dengan radarku menemukanmu \n");
        datas.add(data);

        data = new Data("Tak Pernah Padam", R.drawable.sshandy, R.drawable.sandhysandoro, "Shandy Sandoro",
                " Intro : G Em 2x\n" +
                        "\n" +
                        "         G        Em          \n" +
                        "Senyumanmu masih jelas terkenang    \n" +
                        "           G       Em                   Bm C   Bm D    \n" +
                        "Hadir selalu seakan tak mau hilang dariku dariku     \n" +
                        "           G       Em            \n" +
                        "Takkan mudah ku bisa melupakan      \n" +
                        "        G          Em            \n" +
                        "Segalanya yang telah terjadi           \n" +
                        "        Bm          C          Bm  D         \n" +
                        "Di antara kau dan aku, di antara kita berdua          \n" +
                        "\n" +
                        "Reff :\n" +
                        "         G       C           Em         D         \n" +
                        "Kini tak ada terdengar kabar dari dirimu           \n" +
                        "        G           C           Em       D         \n" +
                        "Kini kau telah menghilang jauh dari diriku       \n" +
                        "     G            C           Em      D     \n" +
                        "Semua tinggal cerita antara kau dan aku      \n" +
                        "        C                        D       \n" +
                        "Namun satu yang perlu engkau tahu             \n" +
                        "         C        D                 G Em             G Em   \n" +
                        "Api cintaku padamu tak pernah padam, tak pernah padam           \n" +
                        "\n" +
                        "            G       Em          \n" +
                        "Takkan mudah ku bisa melupakan       \n" +
                        "        G          Em        \n" +
                        "Segalanya yang telah terjadi            \n" +
                        "        Bm            C         Bm D          \n" +
                        "Di antara kau dan aku, di antara kita berdua          \n" +
                        "\n" +
                        "Back to Reff :\n" +
                        "       C           D               F Em                  F Em\n" +
                        "Api cintaku padamu tak pernah padam,     tak pernah padam               \n" +
                        "Fm Em   Am     Bm         C\n" +
                        "Api cintaku padamu wooo ooo yeah\n" +
                        "\n" +
                        "Back to Reff\n" +
                        "\n" +
                        "       C           D               G Em                  G Em\n" +
                        "Api cintaku padamu tak pernah padam,     tak pernah padam\n" +
                        "\n" +
                        "\n" +
                        "\n");
        datas.add(data);

        data = new Data("Rather Be", R.drawable.clean, R.drawable.cleanbandit, "Clean Bandit",
                "Em        D     C                   C G       \n" +
                        "We're a thousand miles from comfort,\n" +
                        "Em        D     C                   C G\n" +
                        "we have travelled land and sea\n" +
                        "Em        D     C                   C G\n" +
                        "But as long as you are with me,\n" +
                        "Am                     Am (slid to 3rd fret)\n" +
                        " there's no place I rather be\n" +
                        "\n" +
                        "Em        D     C                   C G\n" +
                        "I would wait forever,\n" +
                        "Em        D     C                   C G\n" +
                        " exulted in the scene\n" +
                        "Em        D     C                   C G\n" +
                        "As long as I am with you,\n" +
                        "Am                     Am (slid to 3rd fret)\n" +
                        " my heart continues to beat\n" +
                        "\n" +
                        "~ PRE-CHORUS ~\n" +
                        "\n" +
                        "Em                                           D        \n" +
                        "With every step we take, Kyoto to The Bay\n" +
                        "G                               Am\n" +
                        "Strolling so casually\n" +
                        "Em                                               D\n" +
                        "We're different and the same, gave you another name\n" +
                        "G                              Am\n" +
                        "Switch up the batteries\n" +
                        "\n" +
                        "~ CHORUS ~\n" +
                        "\n" +
                        "Em                  D                     C                              C G\n" +
                        "If you gave me a chance I would take it\n" +
                        "Em                  D                     C                              C G\n" +
                        "It's a shot in the dark but I'll make it\n" +
                        "Em                  D                     C                              C G\n" +
                        "Know with all of your heart, you can't shame me\n" +
                        "Em              D       C                               Am\n" +
                        "When I am with you, there's no place I rather be\n" +
                        "\n" +
                        "Em       D        C                 C G\n" +
                        "N-n-n-no, no, no, no place I rather be [3x]\n");
        datas.add(data);

        data = new Data("Payphone", R.drawable.mmaroon, R.drawable.maroon, "Maroon 5 ft. Wiz Khalifa",
                "         C                  G\n" +
                        "I'm at a payphone trying to call home\n" +
                        "          Em                D\n" +
                        "All of my change I spent on you\n" +
                        "               C\n" +
                        "Where have the times gone\n" +
                        "          G                        Em                D\n" +
                        "Baby it's all wrong, where are the plans we made for two?\n" +
                        "\n" +
                        "       C\n" +
                        "Yeah, I, I know it's hard to remember\n" +
                        "G\n" +
                        "The people we used to be\n" +
                        "Em\n" +
                        "It's even harder to picture\n" +
                        "D\n" +
                        "That you're not here next to me\n" +
                        "C\n" +
                        "You say it's too late to make it\n" +
                        "G\n" +
                        "But is it too late to try?\n" +
                        "Em\n" +
                        "And in our time that you wasted\n" +
                        "D                           C\n" +
                        "All of our bridges burned down\n" +
                        "\n" +
                        "C              G\n" +
                        "I've wasted my nights\n" +
                        "                   Em\n" +
                        "You turned out the lights\n" +
                        "            D\n" +
                        "Now I'm paralyzed\n" +
                        "                    C                      G\n" +
                        "Still stuck in that time when we called it love\n" +
                        "             Em          D\n" +
                        "But even the sun sets in paradise\n" +
                        "\n" +
                        "         C                  G\n" +
                        "I'm at a payphone trying to call home\n" +
                        "          Em                D\n" +
                        "All of my change I spent on you\n" +
                        "               C\n" +
                        "Where have the times gone\n" +
                        "              G                    Em                D  \n" +
                        "Baby it's all wrong, where are the plans we made for two?\n" +
                        "\n" +
                        "              C         G\n" +
                        "If happy ever after did exist\n" +
                        "                 Em               D\n" +
                        "I would still be holding you like this\n" +
                        "          C                      G\n" +
                        "All those fairytales are full of sh*t\n" +
                        "                Em                D\n" +
                        "One more stupid love song I'll be sick\n" +
                        "\n" +
                        "C                              \n" +
                        "You turned your back on tomorrow\n" +
                        "G\n" +
                        "Cause you forgot yesterday\n" +
                        "Em\n" +
                        "I gave you my love to borrow\n" +
                        "D\n" +
                        "But just gave it away\n" +
                        "C\n" +
                        "You can't expect me to be fine\n" +
                        "G\n" +
                        "I don't expect you to care\n" +
                        "Em\n" +
                        "I know I've said it before, but\n" +
                        "D                         C\n" +
                        "All of our bridges burned down\n" +
                        "\n" +
                        "C              G\n" +
                        "I've wasted my nights\n" +
                        "                   Em\n" +
                        "You turned out the lights\n" +
                        "            D\n" +
                        "Now I'm paralyzed\n" +
                        "                      C                      G\n" +
                        "Still stucked in that time when we called it love\n" +
                        "             Em              D\n" +
                        "But even the sun sets in paradise\n" +
                        "\n" +
                        "         C                       G\n" +
                        "I'm at a payphone trying to call home\n" +
                        "          Em                D\n" +
                        "All of my change I spent on you\n" +
                        "               C        \n" +
                        "Where have the times gone\n" +
                        "          G                        Em                D\n" +
                        "Baby it's all wrong, where are the plans we made for two?\n" +
                        "\n" +
                        "              C         G\n" +
                        "If happy ever after did exist\n" +
                        "                 Em               D\n" +
                        "I would still be holding you like this\n" +
                        "          C                      G\n" +
                        "All those fairytales are full of sh*t\n" +
                        "                Em                D\n" +
                        "One more stupid love song I'll be sick\n" +
                        "             C\n" +
                        "Now I'm at a payphone...\n" +
                        "[Wiz Khalifa]\n" +
                        "                     Man work that sh*t\n" +
                        "G\n" +
                        "I'll be out spending all this money while you sitting round\n" +
                        "Em                                          \n" +
                        "Wondering why it wasn't you who came up from nothing\n" +
                        "D\n" +
                        "Made it from the bottom\n" +
                        "Now when you see me I'm stunning\n" +
                        "C          \n" +
                        "And all of my cars start with the push up a button\n" +
                        "G\n" +
                        "Telling me the chances I blew up or whatever you call it\n" +
                        "Em\n" +
                        "Switched the number to my phone\n" +
                        "So you never could call it\n" +
                        "D\n" +
                        "Don't need my name on my show\n" +
                        "You can tell it I'm ballin'\n" +
                        "C\n" +
                        "Swish, what a shame could have got picked\n" +
                        "G                                                 Em\n" +
                        "Had a really good game but you missed your last shot\n" +
                        "So you talk about who you see at the top\n" +
                        "D\n" +
                        "Or what you could've saw\n" +
                        "But sad to say it's over for\n" +
                        "C\n" +
                        "Phantom pulled up valet open doors\n" +
                        "G\n" +
                        "Wiz like go away, got what you was looking for\n" +
                        "Em\n" +
                        "Now ask me who they want\n" +
                        "                            D\n" +
                        "So you can go and take that little piece of sh*t with you\n" +
                        "\n" +
                        "         C                  G\n" +
                        "I'm at a payphone trying to call home\n" +
                        "          Em                D\n" +
                        "All of my change I spent on you\n" +
                        "               C\n" +
                        "Where have the times gone\n" +
                        "          G                        Em                D\n" +
                        "Baby it's all wrong, where are the plans we made for two?\n" +
                        "\n" +
                        "              C          G\n" +
                        "If happy ever after did exist\n" +
                        "                 Em               D \n" +
                        "I would still be holding you like this\n" +
                        "          C                      G\n" +
                        "All those fairytales are full of sh*t\n" +
                        "         Em                       D\n" +
                        "One more stupid love song I'll be sick\n" +
                        "             C\n" +
                        "Now I'm at a payphone...\n" +
                        "\n");
        datas.add(data);


        data = new Data("Talking to the Moon", R.drawable.bbruno, R.drawable.brunomars, "Bruno Mars",
                "#intro : C\n" +
                        "\n" +
                        "C\n" +
                        "I know you're somewhere out there\n" +
                        "E7\n" +
                        "Somewhere far away\n" +
                        "Am             G\n" +
                        "I want you back\n" +
                        "F\n" +
                        "I want you back\n" +
                        "\n" +
                        "C\n" +
                        "My neighbors think I'm crazy\n" +
                        "E7\n" +
                        "But they don't understand\n" +
                        "Am               G\n" +
                        "You're all I have\n" +
                        "F\n" +
                        "You're all I have\n" +
                        "\n" +
                        "Dm\n" +
                        "At night when the stars\n" +
                        "G\n" +
                        "light up my room\n" +
                        "Dm            G\n" +
                        "I sit by myself\n" +
                        "\n" +
                        "#chorus :\n" +
                        "               F G Am\n" +
                        "Talking to the Moon\n" +
                        "              F G Am\n" +
                        "Try to get to You\n" +
                        "   F\n" +
                        "In hopes you're on\n" +
                        "    G\n" +
                        "the other side\n" +
                        "C      Bm     Am  G\n" +
                        "Talking to me too\n" +
                        "          F\n" +
                        "Or am I a fool\n" +
                        "         G\n" +
                        "who sits alone\n" +
                        "                  Am  G  F\n" +
                        "Talking to the moon\n" +
                        "\n" +
                        "\n" +
                        "C\n" +
                        "I'm feeling like\n" +
                        "               E7\n" +
                        "I'm famous The talk of the town\n" +
                        "         Am         G\n" +
                        "They say I've gone mad\n" +
                        "      F\n" +
                        "Yeah I've gone mad\n" +
                        "C\n" +
                        "But they don't know what I know\n" +
                        "E7\n" +
                        "Cause when the sun goes down\n" +
                        "          Am         G\n" +
                        "someone's talking back\n" +
                        "     F\n" +
                        "Yeah They're talking back\n" +
                        "\n" +
                        "Dm\n" +
                        "At night when the stars\n" +
                        "G\n" +
                        "light up my room\n" +
                        "Dm            G\n" +
                        "I sit by myself\n" +
                        "\n" +
                        "#back to chorus\n" +
                        "\n" +
                        "(Dm G)\n" +
                        "Ahh...Ahh...Ahh..\n" +
                        "Do you ever hear me calling\n" +
                        "Ahh...Ahh..Ahh..\n" +
                        "Ho hou ho ho hou\n" +
                        "'Cause every night\n" +
                        "I'm talking to the moon\n" +
                        "\n" +
                        "#back to chorus\n" +
                        "\n" +
                        "C\n" +
                        "I know you're somewhere out there\n" +
                        "E7\n" +
                        "Somewhere far away\n" +
                        "\n" +
                        "\n" +
                        "\n");
        datas.add(data);

        return datas;
    }

    public String toString() {
        return "Lagu";
    }
}
