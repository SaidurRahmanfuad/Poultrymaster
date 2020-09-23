package com.securesoft.sonalikrishi;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


import androidx.annotation.NonNull;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class Home extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private BottomNavigationView bttom_option;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    AlertDialog.Builder ExitMsg;
    private InterstitialAd mInterstitialAda,mInterstitialAdb,mInterstitialAdc,mInterstitialAdd,mInterstitialAde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ads_alldata();
        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        bttom_option = findViewById(R.id.bottom_option);


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.homeFragment, R.id.aboutFragment, R.id.devFragment, R.id.socialFragment, R.id.teamFragment,R.id.donationFragment,R.id.sponsorFragment)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        NavigationUI.setupWithNavController(bttom_option, navController);


        // navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.nav_share:
                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, "My new app https://play.google.com/store/search?q=" + getPackageName());
                startActivity(Intent.createChooser(intent, "Share Via"));
                break;
            case R.id.nav_rating:
                try {
                    Uri uris = Uri.parse("market://details?id=" + getPackageName());
                    Intent gotomarket = new Intent(Intent.ACTION_VIEW, uris);
                    startActivity(gotomarket);
                } catch (ActivityNotFoundException e) {
                    Uri uris = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                    Intent gotomarket = new Intent(Intent.ACTION_VIEW, uris);
                    startActivity(gotomarket);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void loadexitmsg() {
        ExitMsg = new AlertDialog.Builder(this);
        ExitMsg.setMessage("Do you want to Exit?");
        ExitMsg.setTitle("Poultry Master");
        ExitMsg.setCancelable(false);
        ExitMsg.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        ExitMsg.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = ExitMsg.create();
        alertDialog.show();
    }

    public void ads_alldata(){
        mInterstitialAda = new InterstitialAd(this);
        mInterstitialAda.setAdUnitId("ca-app-pub-7815226488144324/6847795050");
        mInterstitialAda.loadAd(new AdRequest.Builder().build());


        mInterstitialAdb = new InterstitialAd(this);
        mInterstitialAdb.setAdUnitId("ca-app-pub-7815226488144324/5248854494");
        mInterstitialAdb.loadAd(new AdRequest.Builder().build());

        mInterstitialAdc = new InterstitialAd(this);
        mInterstitialAdc.setAdUnitId("ca-app-pub-7815226488144324/8996527811");
        mInterstitialAdc.loadAd(new AdRequest.Builder().build());

        mInterstitialAdd = new InterstitialAd(this);
        mInterstitialAdd.setAdUnitId("ca-app-pub-7815226488144324/5057282801");
        mInterstitialAdd.loadAd(new AdRequest.Builder().build());

        mInterstitialAde = new InterstitialAd(this);
        mInterstitialAde.setAdUnitId("ca-app-pub-7815226488144324/7491874452");
        mInterstitialAde.loadAd(new AdRequest.Builder().build());
    }
    @Override
    public void onBackPressed() {
        final NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        if (navController.getCurrentDestination().getId() ==R.id.homeFragment) {
            loadexitmsg();
        }
        if (navController.getCurrentDestination().getId() ==R.id.feed_calculatorFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.bird_capacityCalFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.vaccin_Fragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.helpFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.teamFragment) {
            navController.navigate(R.id.homeFragment);
        }

        if (navController.getCurrentDestination().getId() ==R.id.devFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.aboutFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.devFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.donationFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.socialFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.sponsorFragment) {
            navController.navigate(R.id.homeFragment);
        }
        if (navController.getCurrentDestination().getId() ==R.id.advice_Fragment) {
            navController.navigate(R.id.homeFragment);
        }
        else {

        if (navController.getCurrentDestination().getId() ==R.id.company_chicksFragment) {

            if (mInterstitialAda.isLoaded()) {
                mInterstitialAda.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAda.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAda.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.hubb_arborFragment) {

            if (mInterstitialAda.isLoaded()) {
                mInterstitialAda.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAda.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAda.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }
        if (navController.getCurrentDestination().getId() ==R.id.cobb_irFragment) {

            if (mInterstitialAdb.isLoaded()) {
                mInterstitialAdb.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAdb.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdb.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }
        if (navController.getCurrentDestination().getId() ==R.id.ross_lohmanFragment) {

            if (mInterstitialAdc.isLoaded()) {
                mInterstitialAdc.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAdc.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdc.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.quail_Fragment) {

            if (mInterstitialAdd.isLoaded()) {
                mInterstitialAdd.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAdd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdd.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.hylin_Fragment) {

            if (mInterstitialAde.isLoaded()) {
                mInterstitialAde.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAde.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAde.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.isa_Fragment) {

            if (mInterstitialAda.isLoaded()) {
                mInterstitialAda.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAda.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAda.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.novo_Fragment) {

            if (mInterstitialAdb.isLoaded()) {
                mInterstitialAdb.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAdb.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdb.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.bovans_Fragment) {

            if (mInterstitialAdc.isLoaded()) {
                mInterstitialAdc.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAdc.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdc.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.shaver_Fragment) {

            if (mInterstitialAdd.isLoaded()) {
                mInterstitialAdd.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAdd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdd.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.sonali_Fragment) {

            if (mInterstitialAde.isLoaded()) {
                mInterstitialAde.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAde.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAde.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.mctc_Fragment) {

            if (mInterstitialAda.isLoaded()) {
                mInterstitialAda.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAda.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAda.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.fcr_Fragment) {

            if (mInterstitialAdb.isLoaded()) {
                mInterstitialAdb.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAdb.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdb.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.broiler_calculatorFragment) {

            if (mInterstitialAdc.isLoaded()) {
                mInterstitialAdc.show();
            } else {
                navController.navigate(R.id.feed_calculatorFragment);
            }

            mInterstitialAdc.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdc.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.feed_calculatorFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.sonali_calculatorFragment) {

                if (mInterstitialAdd.isLoaded()) {
                    mInterstitialAdd.show();
                } else {
                    navController.navigate(R.id.feed_calculatorFragment);
                }

                mInterstitialAdd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        // Load the next interstitial.
                        mInterstitialAdd.loadAd(new AdRequest.Builder().build());
                        navController.navigate(R.id.feed_calculatorFragment);
                    }
                });

        }

        if (navController.getCurrentDestination().getId() ==R.id.layer_calculatorFragment) {

            if (mInterstitialAde.isLoaded()) {
                mInterstitialAde.show();
            } else {
                navController.navigate(R.id.feed_calculatorFragment);
            }

            mInterstitialAde.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAde.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.feed_calculatorFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.light_calculatorFragment) {

            if (mInterstitialAda.isLoaded()) {
                mInterstitialAda.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAda.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAda.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.broiler_capacityFragment) {

            if (mInterstitialAdb.isLoaded()) {
                mInterstitialAdb.show();
            } else {
                navController.navigate(R.id.bird_capacityCalFragment);
            }

            mInterstitialAdb.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdb.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.bird_capacityCalFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.sonali_capacityFragment) {

            if (mInterstitialAdc.isLoaded()) {
                mInterstitialAdc.show();
            } else {
                navController.navigate(R.id.bird_capacityCalFragment);
            }

            mInterstitialAdc.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdc.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.bird_capacityCalFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.quail_capacityFragment) {

            if (mInterstitialAdd.isLoaded()) {
                mInterstitialAdd.show();
            } else {
                navController.navigate(R.id.bird_capacityCalFragment);
            }

            mInterstitialAdd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdd.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.bird_capacityCalFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.light_Fragment) {

            if (mInterstitialAde.isLoaded()) {
                mInterstitialAde.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAde.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAde.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.brooding_Fragment) {

            if (mInterstitialAda.isLoaded()) {
                mInterstitialAda.show();
            } else {
                navController.navigate(R.id.homeFragment);
            }

            mInterstitialAda.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAda.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.homeFragment);
                }
            });

        }


        if (navController.getCurrentDestination().getId() ==R.id.broiler_vaccineFragment) {

            if (mInterstitialAdb.isLoaded()) {
                mInterstitialAdb.show();
            } else {
                navController.navigate(R.id.vaccin_Fragment);
            }

            mInterstitialAdb.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdb.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.vaccin_Fragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.soali_vaccineFragment) {

            if (mInterstitialAde.isLoaded()) {
                mInterstitialAde.show();
            } else {
                navController.navigate(R.id.vaccin_Fragment);
            }

            mInterstitialAde.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAde.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.vaccin_Fragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.layer_vaccineFragment) {

            if (mInterstitialAdd.isLoaded()) {
                mInterstitialAdd.show();
            } else {
                navController.navigate(R.id.vaccin_Fragment);
            }

            mInterstitialAdd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdd.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.vaccin_Fragment);
                }
            });

        }

        if (navController.getCurrentDestination().getId() ==R.id.duck_vaccineFragment) {

            if (mInterstitialAdc.isLoaded()) {
                mInterstitialAdc.show();
            } else {
                navController.navigate(R.id.vaccin_Fragment);
            }

            mInterstitialAdc.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    mInterstitialAdc.loadAd(new AdRequest.Builder().build());
                    navController.navigate(R.id.vaccin_Fragment);
                }
            });

        }

        }

    }
}

