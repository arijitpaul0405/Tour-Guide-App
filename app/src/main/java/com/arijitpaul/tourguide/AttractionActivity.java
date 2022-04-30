package com.arijitpaul.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.arijitpaul.tourguide.Adapters.CustomAdapter;
import com.arijitpaul.tourguide.CustomClass.WordClass;

import java.util.ArrayList;

public class AttractionActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<WordClass> list = new ArrayList<>();
        list.add(new WordClass(R.drawable.victoria_memorial, "Victoria Memorial", getString(R.string.victoria_memorial), true));
        list.add(new WordClass(R.drawable.william_fort, "William Fort", getString(R.string.william_fort), true));
        list.add(new WordClass(R.drawable.belur_math, "Belur Math", getString(R.string.belur_math), true));
        list.add(new WordClass(R.drawable.howrah_bridge, "Howrah Bridge", getString(R.string.howrah_bridge), true));
        list.add(new WordClass(R.drawable.birla_planetarium, "Birla Planetarium", getString(R.string.birla_planetarium), true));
        list.add(new WordClass(R.drawable.indian_museum, "Indian Museum", getString(R.string.indian_museum), true));
        list.add(new WordClass(R.drawable.marble_palace_mansion, "Marble Palace Mansion", getString(R.string.marble_palace_mansion), true));
        list.add(new WordClass(R.drawable.mother_house, "Mother House", getString(R.string.mother_house), true));
        list.add(new WordClass(R.drawable.science_city, "Science City", getString(R.string.science_city), true));
        list.add(new WordClass(R.drawable.st_paul_cathedral, "St. Paul's Cathedral", getString(R.string.st_paul_cathedral), true));
        list.add(new WordClass(R.drawable.tajpur, "Tajpur", getString(R.string.tajpur), true));
        list.add(new WordClass(R.drawable.birla_mandir, "Birla Mandir", getString(R.string.birla_madir), true));
        list.add(new WordClass(R.drawable.eden_garden, "Eden Gardens", getString(R.string.eden_garden), true));
        list.add(new WordClass(R.drawable.jorasanka_thakur_bari, "Jorasanko Thakur Bari", getString(R.string.jorasanko_thakur_bari), true));
        list.add(new WordClass(R.drawable.birla_industrial_technological, "Birla Industrial & Technological Museum", getString(R.string.birla_industrial_technological), true));
        list.add(new WordClass(R.drawable.rabindra_sarovar, "Rabindra Sarovar", getString(R.string.rabindra_sarovar), true));
        list.add(new WordClass(R.drawable.kalighat_temple, "Kalighat Temple", getString(R.string.kalighat_temple), true));
        list.add(new WordClass(R.drawable.shobabazar_rajbari, "Shobhabajar Rajbari", getString(R.string.shobabazar_rajbari), true));
        list.add(new WordClass(R.drawable.botanical_garden, "Botanical Gardens", getString(R.string.botanical_garden), true));
        list.add(new WordClass(R.drawable.nakhoda_mosque, "Nakhoda Mosque", getString(R.string.nakhoda_mosque), true));
        list.add(new WordClass(R.drawable.alipore_zoo, "Alipore Zoo", getString(R.string.alipore_zoo), true));
        list.add(new WordClass(R.drawable.sabarna_sangrahashala, "Sabarna Sangrahashala", getString(R.string.sabarna_sangrahashala), true));
        list.add(new WordClass(R.drawable.eco_tourism_park, "Eco Tourism Park", getString(R.string.eco_tourism_park), true));
        list.add(new WordClass(R.drawable.pareshnath_jain_temple, "Pareshnath Jain Temple", getString(R.string.pareshnath_jain_temple), true));
        list.add(new WordClass(R.drawable.nicco_park, "Nicco Park", getString(R.string.nicco_park), true));
        list.add(new WordClass(R.drawable.prinsep_ghat, "Princep Ghat", getString(R.string.princep_ghat), true));
        list.add(new WordClass(R.drawable.aquatica, "Aquatica", getString(R.string.aquatica), true));
        list.add(new WordClass(R.drawable.park_street, "Park Street", getString(R.string.park_street), true));
        list.add(new WordClass(R.drawable.chowringhee, "Chowringhee", getString(R.string.chowringhee), true));
        list.add(new WordClass(R.drawable.iskcon_kolkata, "ISKCON", getString(R.string.iskcon), true));
        list.add(new WordClass(R.drawable.south_park_street_cementry, "South Park Street Cemetery", getString(R.string.south_park_street_cementry), true));
        list.add(new WordClass(R.drawable.sonajhuri_forest, "Sonajhuri Forest", getString(R.string.sonajhuri_forest), true));
        list.add(new WordClass(R.drawable.st_john_church, "St John's Church", getString(R.string.st_john_church), true));
        list.add(new WordClass(R.drawable.barrackpore, "Barrackpore", getString(R.string.barrackpore), true));
        list.add(new WordClass(R.drawable.jhargram, "Jhargram", getString(R.string.jhargram), true));
        list.add(new WordClass(R.drawable.baabur_haat, "Baabur Haat", getString(R.string.baabur_haat), true));
        list.add(new WordClass(R.drawable.kamarpukur, "Kamarpukur", getString(R.string.kamarpukur), true));
        list.add(new WordClass(R.drawable.deulti, "Deulti", getString(R.string.deulti), true));
        list.add(new WordClass(R.drawable.hooghly_riverfront, "Hooghly Riverfront", getString(R.string.hooghly_riverfront), true));
        list.add(new WordClass(R.drawable.maidan, "Maidan", getString(R.string.maidan), true));
        list.add(new WordClass(R.drawable.central_park, "Central Park", getString(R.string.central_park), true));
        list.add(new WordClass(R.drawable.millenium_park, "Millenium Park", getString(R.string.millenium_park), true));
        list.add(new WordClass(R.drawable.deshapriyo_park, "Deshapriya Park", getString(R.string.deshapriyo_park), true));
        list.add(new WordClass(R.drawable.safari_park, "Safari Park", getString(R.string.safari_park), true));
        list.add(new WordClass(R.drawable.mohor_kunja, "Mohor Kunja", getString(R.string.mohor_kunja), true));
        list.add(new WordClass(R.drawable.elliot_park, "Elliot Park", getString(R.string.elliot_park), true));
        list.add(new WordClass(R.drawable.gitanjali_sports, "Gitanjali Sports Complex", getString(R.string.gitanjali_sports_complex), true));
        list.add(new WordClass(R.drawable.kishore_bharati, "Kishore Bharati Kirangan", getString(R.string.kishore_bharati), true));
        list.add(new WordClass(R.drawable.salt_lake_stadium, "Salt Lake Stadium", getString(R.string.salt_lake_stadium), true));
        list.add(new WordClass(R.drawable.rabindra_sarovar_stadium, "Rabindra Sarobar Stadium", getString(R.string.rabindra_sarovar_stadium), true));
        list.add(new WordClass(R.drawable.mohan_bagan_stadium, "Mohunbagan Stadium", getString(R.string.mohunbagan_stadium), true));
        list.add(new WordClass(R.drawable.netaji_indoor_stadium, "Netaji Indoor Stadium", getString(R.string.netaji_indoor_stadium), true));
        list.add(new WordClass(R.drawable.barasat_stadium, "Barasat Stadium", getString(R.string.barasat_stadium), true));
        list.add(new WordClass(R.drawable.east_bengal_ground, "East Bengal Stadium", getString(R.string.east_bengal_ground), true));
        list.add(new WordClass(R.drawable.kolkata_race_course, "Kolkata Race Course", getString(R.string.kolkata_race_course), true));
        list.add(new WordClass(R.drawable.nalban_boating_park, "Nalban Boating Park", getString(R.string.nalban_boating_park), true));
        list.add(new WordClass(R.drawable.snow_park, "Snow Park", getString(R.string.snow_park), true));
        list.add(new WordClass(R.drawable.wet_o_wild, "Wet-o-Wild", getString(R.string.wet_o_wild), true));
        list.add(new WordClass(R.drawable.genesis_art_galary, "Genesis Art Gallery", getString(R.string.genesis_art_gallery), true));
        list.add(new WordClass(R.drawable.galerie_88, "Galerie 88", getString(R.string.galerie_88), true));
        list.add(new WordClass(R.drawable.experimentor_art_galary, "Experimentor Art Gallery", getString(R.string.experimenter_art_gallery), true));
        list.add(new WordClass(R.drawable.master_collection_art_gallery, "Masters Collection Art Gallery", getString(R.string.masters_collections_art_gallery), true));
        list.add(new WordClass(R.drawable.verandah_art_gallery, "Verandah Art Gallery", getString(R.string.verandah_art_gallery), true));
        list.add(new WordClass(R.drawable.chitrakoot_art_gallery, "Chitrakoot Art Gallery", getString(R.string.chitrakoot_art_gallery), true));
        list.add(new WordClass(R.drawable.akar_prakar_gallery, "Akar Prakar Gallery", getString(R.string.akar_prakar_gallery), true));
        list.add(new WordClass(R.drawable.aakriti_art_gallery, "Aakriti Art Gallery", getString(R.string.aakriti_art_gallery), true));
        list.add(new WordClass(R.drawable.chemould_art_gallery, "Chemould Art Gallery", getString(R.string.chemould_art_gallery), true));
        list.add(new WordClass(R.drawable.janus_art_gallery, "Janus Art Gallery", getString(R.string.janus_art_gallery), true));
        list.add(new WordClass(R.drawable.harrington_street_srt_centre, "Harrington Street Arts Centre", getString(R.string.harrington_street_art_centre), true));
        list.add(new WordClass(R.drawable.cima_gallery, "CIMA Gallery Pvt Ltd", getString(R.string.cima_gallery), true));
        list.add(new WordClass(R.drawable.megan_david_sunagogue, "Megan David Synagogue", getString(R.string.magen_david_synagogue), true));
        list.add(new WordClass(R.drawable.beth_el_synagogue, "Beth El Synagogue", getString(R.string.beth_el_synagogue), true));
        list.add(new WordClass(R.drawable.neveh_shalome_synagogue, "Neveh Shalome Synagogue", getString(R.string.neveh_shalome_synagogue), true));
        list.add(new WordClass(R.drawable.tram_rides, "Tram Rides in Kolkata", getString(R.string.trams_in_kolkata), true));
        list.add(new WordClass(R.drawable.mousuni_island, "Mousuni Island", getString(R.string.mousuni_island), true));
        list.add(new WordClass(R.drawable.dakshineshwar_kali, "Dakshineswar Kali", getString(R.string.dakshineswar_kali), true));
        list.add(new WordClass(R.drawable.ramkrishnapur_ghat, "Ramkrishnapur Ghat", getString(R.string.ramkrishnapur_ghat), true));

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            WordClass currentItem = adapter.getItem(position);

            Intent intent = new Intent(AttractionActivity.this, InfoShowActivity.class);
            intent.putExtra("pic", currentItem.getImage());
            intent.putExtra("title", currentItem.getTitle());
            intent.putExtra("info", currentItem.getInfo());
            intent.putExtra("actionbar_heading", "Attraction");
            startActivity(intent);
        });

    }
}