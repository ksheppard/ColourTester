package com.ks94.colourtester;

//import java.awt.Color;

import android.graphics.Color;

import java.util.ArrayList;

/**
 * Java Code to get a color name from rgb/hex value/awt color
 * <p/>
 * The part of looking up a color name from the rgb values is edited from
 * https://gist.github.com/nightlark/6482130#file-gistfile1-java (that has some errors) by Ryan Mast (nightlark)
 *
 * @author Xiaoxiao Li
 */
public class ColourUtil
{

    /**
     * Initialize the color list that we have.
     */

    ArrayList<ColorName> colorList;


    public ColourUtil(boolean basic)
    {
        colorList = new ArrayList<ColorName>();
        if (basic)
        {
            initBasicColorList();
        } else
        {
            initAdvancedColorList();
        }
    }

    //<editor-fold desc="init colour list">
    private void initBasicColorList()
    {
        colorList.add(new ColorName("Black", 0x00, 0x00, 0x00));
        colorList.add(new ColorName("Blue", 0x00, 0x00, 0xFF));
        colorList.add(new ColorName("Brown", 0x96, 0x4B, 0x00));
        colorList.add(new ColorName("Cyan", 0x00, 0xFF, 0xFF));
        colorList.add(new ColorName("Magenta", 0xFF, 0x00, 0xFF));
        colorList.add(new ColorName("Gray", 0x80, 0x80, 0x80));
        colorList.add(new ColorName("Green", 0x00, 0x80, 0x00));
        colorList.add(new ColorName("Navy", 0x00, 0x00, 0x80));
        colorList.add(new ColorName("Orange", 0xFF, 0xA5, 0x00));
        colorList.add(new ColorName("Pink", 0xFF, 0xC0, 0xCB));
        colorList.add(new ColorName("Purple", 0x80, 0x00, 0x80));
        colorList.add(new ColorName("Red", 0xFF, 0x00, 0x00));
        colorList.add(new ColorName("Silver", 0xC0, 0xC0, 0xC0));
        colorList.add(new ColorName("Gold", 0xFF, 0xD7, 0x00));
        colorList.add(new ColorName("Turquoise", 0x40, 0xE0, 0xD0));
        colorList.add(new ColorName("Violet", 0xEE, 0x82, 0xEE));
        colorList.add(new ColorName("White", 0xFF, 0xFF, 0xFF));
        colorList.add(new ColorName("Yellow", 0xFF, 0xFF, 0x00));
    }

    private void initAdvancedColorList()
    {
        colorList.add(new ColorName("Air Force blue (RAF)", 0x5D, 0x8A, 0xA8));
        colorList.add(new ColorName("Air Force blue (USAF)", 0x00, 0x30, 0x8F));
        colorList.add(new ColorName("Air superiority blue", 0x72, 0xA0, 0xC1));
        colorList.add(new ColorName("Alabama Crimson", 0xA3, 0x26, 0x38));
        colorList.add(new ColorName("Alice blue", 0xF0, 0xF8, 0xFF));
        colorList.add(new ColorName("Alizarin crimson", 0xE3, 0x26, 0x36));
        colorList.add(new ColorName("Alloy orange", 0xC4, 0x62, 0x10));
        colorList.add(new ColorName("Almond", 0xEF, 0xDE, 0xCD));
        colorList.add(new ColorName("Amaranth", 0xE5, 0x2B, 0x50));
        colorList.add(new ColorName("Amber", 0xFF, 0xBF, 0x00));
        colorList.add(new ColorName("Amber (SAE/ECE)", 0xFF, 0x7E, 0x00));
        colorList.add(new ColorName("American rose", 0xFF, 0x03, 0x3E));
        colorList.add(new ColorName("Amethyst", 0x99, 0x66, 0xCC));
        colorList.add(new ColorName("Android Green", 0xA4, 0xC6, 0x39));
        colorList.add(new ColorName("Anti-flash white", 0xF2, 0xF3, 0xF4));
        colorList.add(new ColorName("Antique brass", 0xCD, 0x95, 0x75));
        colorList.add(new ColorName("Antique fuchsia", 0x91, 0x5C, 0x83));
        colorList.add(new ColorName("Antique ruby", 0x84, 0x1B, 0x2D));
        colorList.add(new ColorName("Antique white", 0xFA, 0xEB, 0xD7));
        colorList.add(new ColorName("Ao (English)", 0x00, 0x80, 0x00));
        colorList.add(new ColorName("Apple green", 0x8D, 0xB6, 0x00));
        colorList.add(new ColorName("Apricot", 0xFB, 0xCE, 0xB1));
        colorList.add(new ColorName("Aqua", 0x00, 0xFF, 0xFF));
        colorList.add(new ColorName("Aquamarine", 0x7F, 0xFF, 0xD4));
        colorList.add(new ColorName("Army green", 0x4B, 0x53, 0x20));
        colorList.add(new ColorName("Arsenic", 0x3B, 0x44, 0x4B));
        colorList.add(new ColorName("Arylide yellow", 0xE9, 0xD6, 0x6B));
        colorList.add(new ColorName("Ash grey", 0xB2, 0xBE, 0xB5));
        colorList.add(new ColorName("Asparagus", 0x87, 0xA9, 0x6B));
        colorList.add(new ColorName("Atomic tangerine", 0xFF, 0x99, 0x66));
        colorList.add(new ColorName("Auburn", 0xA5, 0x2A, 0x2A));
        colorList.add(new ColorName("Aureolin", 0xFD, 0xEE, 0x00));
        colorList.add(new ColorName("AuroMetalSaurus", 0x6E, 0x7F, 0x80));
        colorList.add(new ColorName("Avocado", 0x56, 0x82, 0x03));
        colorList.add(new ColorName("Azure", 0x00, 0x7F, 0xFF));
        colorList.add(new ColorName("Azure mist/web", 0xF0, 0xFF, 0xFF));
        colorList.add(new ColorName("Baby blue", 0x89, 0xCF, 0xF0));
        colorList.add(new ColorName("Baby blue eyes", 0xA1, 0xCA, 0xF1));
        colorList.add(new ColorName("Baby pink", 0xF4, 0xC2, 0xC2));
        colorList.add(new ColorName("Ball Blue", 0x21, 0xAB, 0xCD));
        colorList.add(new ColorName("Banana Mania", 0xFA, 0xE7, 0xB5));
        colorList.add(new ColorName("Banana yellow", 0xFF, 0xE1, 0x35));
        colorList.add(new ColorName("Barn red", 0x7C, 0x0A, 0x02));
        colorList.add(new ColorName("Battleship grey", 0x84, 0x84, 0x82));
        colorList.add(new ColorName("Bazaar", 0x98, 0x77, 0x7B));
        colorList.add(new ColorName("Beau blue", 0xBC, 0xD4, 0xE6));
        colorList.add(new ColorName("Beaver", 0x9F, 0x81, 0x70));
        colorList.add(new ColorName("Beige", 0xF5, 0xF5, 0xDC));
        colorList.add(new ColorName("Big dip o�ruby", 0x9C, 0x25, 0x42));
        colorList.add(new ColorName("Bisque", 0xFF, 0xE4, 0xC4));
        colorList.add(new ColorName("Bistre", 0x3D, 0x2B, 0x1F));
        colorList.add(new ColorName("Bittersweet", 0xFE, 0x6F, 0x5E));
        colorList.add(new ColorName("Bittersweet shimmer", 0xBF, 0x4F, 0x51));
        colorList.add(new ColorName("Black", 0x00, 0x00, 0x00));
        colorList.add(new ColorName("Black bean", 0x3D, 0x0C, 0x02));
        colorList.add(new ColorName("Black leather jacket", 0x25, 0x35, 0x29));
        colorList.add(new ColorName("Black olive", 0x3B, 0x3C, 0x36));
        colorList.add(new ColorName("Blanched Almond", 0xFF, 0xEB, 0xCD));
        colorList.add(new ColorName("Blast-off bronze", 0xA5, 0x71, 0x64));
        colorList.add(new ColorName("Bleu de France", 0x31, 0x8C, 0xE7));
        colorList.add(new ColorName("Blizzard Blue", 0xAC, 0xE5, 0xEE));
        colorList.add(new ColorName("Blond", 0xFA, 0xF0, 0xBE));
        colorList.add(new ColorName("Blue", 0x00, 0x00, 0xFF));
        colorList.add(new ColorName("Blue (Crayola)", 0x1F, 0x75, 0xFE));
        colorList.add(new ColorName("Blue (Munsell)", 0x00, 0x93, 0xAF));
        colorList.add(new ColorName("Blue (NCS)", 0x00, 0x87, 0xBD));
        colorList.add(new ColorName("Blue (pigment)", 0x33, 0x33, 0x99));
        colorList.add(new ColorName("Blue (RYB)", 0x02, 0x47, 0xFE));
        colorList.add(new ColorName("Blue Bell", 0xA2, 0xA2, 0xD0));
        colorList.add(new ColorName("Blue Gray", 0x66, 0x99, 0xCC));
        colorList.add(new ColorName("Blue-green", 0x0D, 0x98, 0xBA));
        colorList.add(new ColorName("Blue sapphire", 0x12, 0x61, 0x80));
        colorList.add(new ColorName("Blue-violet", 0x8A, 0x2B, 0xE2));
        colorList.add(new ColorName("Blush", 0xDE, 0x5D, 0x83));
        colorList.add(new ColorName("Bole", 0x79, 0x44, 0x3B));
        colorList.add(new ColorName("Bondi blue", 0x00, 0x95, 0xB6));
        colorList.add(new ColorName("Bone", 0xE3, 0xDA, 0xC9));
        colorList.add(new ColorName("Boston University Red", 0xCC, 0x00, 0x00));
        colorList.add(new ColorName("Bottle green", 0x00, 0x6A, 0x4E));
        colorList.add(new ColorName("Boysenberry", 0x87, 0x32, 0x60));
        colorList.add(new ColorName("Brandeis blue", 0x00, 0x70, 0xFF));
        colorList.add(new ColorName("Brass", 0xB5, 0xA6, 0x42));
        colorList.add(new ColorName("Brick red", 0xCB, 0x41, 0x54));
        colorList.add(new ColorName("Bright cerulean", 0x1D, 0xAC, 0xD6));
        colorList.add(new ColorName("Bright green", 0x66, 0xFF, 0x00));
        colorList.add(new ColorName("Bright lavender", 0xBF, 0x94, 0xE4));
        colorList.add(new ColorName("Bright maroon", 0xC3, 0x21, 0x48));
        colorList.add(new ColorName("Bright pink", 0xFF, 0x00, 0x7F));
        colorList.add(new ColorName("Bright turquoise", 0x08, 0xE8, 0xDE));
        colorList.add(new ColorName("Bright ube", 0xD1, 0x9F, 0xE8));
        colorList.add(new ColorName("Brilliant lavender", 0xF4, 0xBB, 0xFF));
        colorList.add(new ColorName("Brilliant rose", 0xFF, 0x55, 0xA3));
        colorList.add(new ColorName("Brink pink", 0xFB, 0x60, 0x7F));
        colorList.add(new ColorName("British racing green", 0x00, 0x42, 0x25));
        colorList.add(new ColorName("Bronze", 0xCD, 0x7F, 0x32));
        colorList.add(new ColorName("Brown (traditional)", 0x96, 0x4B, 0x00));
        colorList.add(new ColorName("Brown (web)", 0xA5, 0x2A, 0x2A));
        colorList.add(new ColorName("Bubble gum", 0xFF, 0xC1, 0xCC));
        colorList.add(new ColorName("Bubbles", 0xE7, 0xFE, 0xFF));
        colorList.add(new ColorName("Buff", 0xF0, 0xDC, 0x82));
        colorList.add(new ColorName("Bulgarian rose", 0x48, 0x06, 0x07));
        colorList.add(new ColorName("Burgundy", 0x80, 0x00, 0x20));
        colorList.add(new ColorName("Burlywood", 0xDE, 0xB8, 0x87));
        colorList.add(new ColorName("Burnt orange", 0xCC, 0x55, 0x00));
        colorList.add(new ColorName("Burnt sienna", 0xE9, 0x74, 0x51));
        colorList.add(new ColorName("Burnt umber", 0x8A, 0x33, 0x24));
        colorList.add(new ColorName("Byzantine", 0xBD, 0x33, 0xA4));
        colorList.add(new ColorName("Byzantium", 0x70, 0x29, 0x63));
        colorList.add(new ColorName("Cadet", 0x53, 0x68, 0x72));
        colorList.add(new ColorName("Cadet blue", 0x5F, 0x9E, 0xA0));
        colorList.add(new ColorName("Cadet grey", 0x91, 0xA3, 0xB0));
        colorList.add(new ColorName("Cadmium green", 0x00, 0x6B, 0x3C));
        colorList.add(new ColorName("Cadmium orange", 0xED, 0x87, 0x2D));
        colorList.add(new ColorName("Cadmium red", 0xE3, 0x00, 0x22));
        colorList.add(new ColorName("Cadmium yellow", 0xFF, 0xF6, 0x00));
        colorList.add(new ColorName("Caf� au lait", 0xA6, 0x7B, 0x5B));
        colorList.add(new ColorName("Caf� noir", 0x4B, 0x36, 0x21));
        colorList.add(new ColorName("Cal Poly green", 0x1E, 0x4D, 0x2B));
        colorList.add(new ColorName("Cambridge Blue", 0xA3, 0xC1, 0xAD));
        colorList.add(new ColorName("Camel", 0xC1, 0x9A, 0x6B));
        colorList.add(new ColorName("Cameo pink", 0xEF, 0xBB, 0xCC));
        colorList.add(new ColorName("Camouflage green", 0x78, 0x86, 0x6B));
        colorList.add(new ColorName("Canary yellow", 0xFF, 0xEF, 0x00));
        colorList.add(new ColorName("Candy apple red", 0xFF, 0x08, 0x00));
        colorList.add(new ColorName("Candy pink", 0xE4, 0x71, 0x7A));
        colorList.add(new ColorName("Capri", 0x00, 0xBF, 0xFF));
        colorList.add(new ColorName("Caput mortuum", 0x59, 0x27, 0x20));
        colorList.add(new ColorName("Cardinal", 0xC4, 0x1E, 0x3A));
        colorList.add(new ColorName("Caribbean green", 0x00, 0xCC, 0x99));
        colorList.add(new ColorName("Carmine", 0x96, 0x00, 0x18));
        colorList.add(new ColorName("Carmine (M&P)", 0xD7, 0x00, 0x40));
        colorList.add(new ColorName("Carmine pink", 0xEB, 0x4C, 0x42));
        colorList.add(new ColorName("Carmine red", 0xFF, 0x00, 0x38));
        colorList.add(new ColorName("Carnation pink", 0xFF, 0xA6, 0xC9));
        colorList.add(new ColorName("Carnelian", 0xB3, 0x1B, 0x1B));
        colorList.add(new ColorName("Carolina blue", 0x99, 0xBA, 0xDD));
        colorList.add(new ColorName("Carrot orange", 0xED, 0x91, 0x21));
        colorList.add(new ColorName("Catalina blue", 0x06, 0x2A, 0x78));
        colorList.add(new ColorName("Ceil", 0x92, 0xA1, 0xCF));
        colorList.add(new ColorName("Celadon", 0xAC, 0xE1, 0xAF));
        colorList.add(new ColorName("Celadon Blue", 0x00, 0x7B, 0xA7));
        colorList.add(new ColorName("Celadon Green", 0x2F, 0x84, 0x7C));
        colorList.add(new ColorName("Celeste (colour)", 0xB2, 0xFF, 0xFF));
        colorList.add(new ColorName("Celestial blue", 0x49, 0x97, 0xD0));
        colorList.add(new ColorName("Cerise", 0xDE, 0x31, 0x63));
        colorList.add(new ColorName("Cerise pink", 0xEC, 0x3B, 0x83));
        colorList.add(new ColorName("Cerulean", 0x00, 0x7B, 0xA7));
        colorList.add(new ColorName("Cerulean blue", 0x2A, 0x52, 0xBE));
        colorList.add(new ColorName("Cerulean frost", 0x6D, 0x9B, 0xC3));
        colorList.add(new ColorName("CG Blue", 0x00, 0x7A, 0xA5));
        colorList.add(new ColorName("CG Red", 0xE0, 0x3C, 0x31));
        colorList.add(new ColorName("Chamoisee", 0xA0, 0x78, 0x5A));
        colorList.add(new ColorName("Champagne", 0xFA, 0xD6, 0xA5));
        colorList.add(new ColorName("Charcoal", 0x36, 0x45, 0x4F));
        colorList.add(new ColorName("Charm pink", 0xE6, 0x8F, 0xAC));
        colorList.add(new ColorName("Chartreuse (traditional)", 0xDF, 0xFF, 0x00));
        colorList.add(new ColorName("Chartreuse (web)", 0x7F, 0xFF, 0x00));
        colorList.add(new ColorName("Cherry", 0xDE, 0x31, 0x63));
        colorList.add(new ColorName("Cherry blossom pink", 0xFF, 0xB7, 0xC5));
        colorList.add(new ColorName("Chestnut", 0xCD, 0x5C, 0x5C));
        colorList.add(new ColorName("China pink", 0xDE, 0x6F, 0xA1));
        colorList.add(new ColorName("China rose", 0xA8, 0x51, 0x6E));
        colorList.add(new ColorName("Chinese red", 0xAA, 0x38, 0x1E));
        colorList.add(new ColorName("Chocolate (traditional)", 0x7B, 0x3F, 0x00));
        colorList.add(new ColorName("Chocolate (web)", 0xD2, 0x69, 0x1E));
        colorList.add(new ColorName("Chrome yellow", 0xFF, 0xA7, 0x00));
        colorList.add(new ColorName("Cinereous", 0x98, 0x81, 0x7B));
        colorList.add(new ColorName("Cinnabar", 0xE3, 0x42, 0x34));
        colorList.add(new ColorName("Cinnamon", 0xD2, 0x69, 0x1E));
        colorList.add(new ColorName("Citrine", 0xE4, 0xD0, 0x0A));
        colorList.add(new ColorName("Classic rose", 0xFB, 0xCC, 0xE7));
        colorList.add(new ColorName("Cobalt", 0x00, 0x47, 0xAB));
        colorList.add(new ColorName("Cocoa brown", 0xD2, 0x69, 0x1E));
        colorList.add(new ColorName("Coffee", 0x6F, 0x4E, 0x37));
        colorList.add(new ColorName("Columbia blue", 0x9B, 0xDD, 0xFF));
        colorList.add(new ColorName("Congo pink", 0xF8, 0x83, 0x79));
        colorList.add(new ColorName("Cool black", 0x00, 0x2E, 0x63));
        colorList.add(new ColorName("Cool grey", 0x8C, 0x92, 0xAC));
        colorList.add(new ColorName("Copper", 0xB8, 0x73, 0x33));
        colorList.add(new ColorName("Copper (Crayola)", 0xDA, 0x8A, 0x67));
        colorList.add(new ColorName("Copper penny", 0xAD, 0x6F, 0x69));
        colorList.add(new ColorName("Copper red", 0xCB, 0x6D, 0x51));
        colorList.add(new ColorName("Copper rose", 0x99, 0x66, 0x66));
        colorList.add(new ColorName("Coquelicot", 0xFF, 0x38, 0x00));
        colorList.add(new ColorName("Coral", 0xFF, 0x7F, 0x50));
        colorList.add(new ColorName("Coral pink", 0xF8, 0x83, 0x79));
        colorList.add(new ColorName("Coral red", 0xFF, 0x40, 0x40));
        colorList.add(new ColorName("Cordovan", 0x89, 0x3F, 0x45));
        colorList.add(new ColorName("Corn", 0xFB, 0xEC, 0x5D));
        colorList.add(new ColorName("Cornell Red", 0xB3, 0x1B, 0x1B));
        colorList.add(new ColorName("Cornflower blue", 0x64, 0x95, 0xED));
        colorList.add(new ColorName("Cornsilk", 0xFF, 0xF8, 0xDC));
        colorList.add(new ColorName("Cosmic latte", 0xFF, 0xF8, 0xE7));
        colorList.add(new ColorName("Cotton candy", 0xFF, 0xBC, 0xD9));
        colorList.add(new ColorName("Cream", 0xFF, 0xFD, 0xD0));
        colorList.add(new ColorName("Crimson", 0xDC, 0x14, 0x3C));
        colorList.add(new ColorName("Crimson glory", 0xBE, 0x00, 0x32));
        colorList.add(new ColorName("Cyan", 0x00, 0xFF, 0xFF));
        colorList.add(new ColorName("Cyan (process)", 0x00, 0xB7, 0xEB));
        colorList.add(new ColorName("Daffodil", 0xFF, 0xFF, 0x31));
        colorList.add(new ColorName("Dandelion", 0xF0, 0xE1, 0x30));
        colorList.add(new ColorName("Dark blue", 0x00, 0x00, 0x8B));
        colorList.add(new ColorName("Dark brown", 0x65, 0x43, 0x21));
        colorList.add(new ColorName("Dark byzantium", 0x5D, 0x39, 0x54));
        colorList.add(new ColorName("Dark candy apple red", 0xA4, 0x00, 0x00));
        colorList.add(new ColorName("Dark cerulean", 0x08, 0x45, 0x7E));
        colorList.add(new ColorName("Dark chestnut", 0x98, 0x69, 0x60));
        colorList.add(new ColorName("Dark coral", 0xCD, 0x5B, 0x45));
        colorList.add(new ColorName("Dark cyan", 0x00, 0x8B, 0x8B));
        colorList.add(new ColorName("Dark electric blue", 0x53, 0x68, 0x78));
        colorList.add(new ColorName("Dark goldenrod", 0xB8, 0x86, 0x0B));
        colorList.add(new ColorName("Dark gray", 0xA9, 0xA9, 0xA9));
        colorList.add(new ColorName("Dark green", 0x01, 0x32, 0x20));
        colorList.add(new ColorName("Dark imperial blue", 0x00, 0x41, 0x6A));
        colorList.add(new ColorName("Dark jungle green", 0x1A, 0x24, 0x21));
        colorList.add(new ColorName("Dark khaki", 0xBD, 0xB7, 0x6B));
        colorList.add(new ColorName("Dark lava", 0x48, 0x3C, 0x32));
        colorList.add(new ColorName("Dark lavender", 0x73, 0x4F, 0x96));
        colorList.add(new ColorName("Dark magenta", 0x8B, 0x00, 0x8B));
        colorList.add(new ColorName("Dark midnight blue", 0x00, 0x33, 0x66));
        colorList.add(new ColorName("Dark olive green", 0x55, 0x6B, 0x2F));
        colorList.add(new ColorName("Dark orange", 0xFF, 0x8C, 0x00));
        colorList.add(new ColorName("Dark orchid", 0x99, 0x32, 0xCC));
        colorList.add(new ColorName("Dark pastel blue", 0x77, 0x9E, 0xCB));
        colorList.add(new ColorName("Dark pastel green", 0x03, 0xC0, 0x3C));
        colorList.add(new ColorName("Dark pastel purple", 0x96, 0x6F, 0xD6));
        colorList.add(new ColorName("Dark pastel red", 0xC2, 0x3B, 0x22));
        colorList.add(new ColorName("Dark pink", 0xE7, 0x54, 0x80));
        colorList.add(new ColorName("Dark powder blue", 0x00, 0x33, 0x99));
        colorList.add(new ColorName("Dark raspberry", 0x87, 0x26, 0x57));
        colorList.add(new ColorName("Dark red", 0x8B, 0x00, 0x00));
        colorList.add(new ColorName("Dark salmon", 0xE9, 0x96, 0x7A));
        colorList.add(new ColorName("Dark scarlet", 0x56, 0x03, 0x19));
        colorList.add(new ColorName("Dark sea green", 0x8F, 0xBC, 0x8F));
        colorList.add(new ColorName("Dark sienna", 0x3C, 0x14, 0x14));
        colorList.add(new ColorName("Dark slate blue", 0x48, 0x3D, 0x8B));
        colorList.add(new ColorName("Dark slate gray", 0x2F, 0x4F, 0x4F));
        colorList.add(new ColorName("Dark spring green", 0x17, 0x72, 0x45));
        colorList.add(new ColorName("Dark tan", 0x91, 0x81, 0x51));
        colorList.add(new ColorName("Dark tangerine", 0xFF, 0xA8, 0x12));
        colorList.add(new ColorName("Dark taupe", 0x48, 0x3C, 0x32));
        colorList.add(new ColorName("Dark terra cotta", 0xCC, 0x4E, 0x5C));
        colorList.add(new ColorName("Dark turquoise", 0x00, 0xCE, 0xD1));
        colorList.add(new ColorName("Dark violet", 0x94, 0x00, 0xD3));
        colorList.add(new ColorName("Dark yellow", 0x9B, 0x87, 0x0C));
        colorList.add(new ColorName("Dartmouth green", 0x00, 0x70, 0x3C));
        colorList.add(new ColorName("Davy's grey", 0x55, 0x55, 0x55));
        colorList.add(new ColorName("Debian red", 0xD7, 0x0A, 0x53));
        colorList.add(new ColorName("Deep carmine", 0xA9, 0x20, 0x3E));
        colorList.add(new ColorName("Deep carmine pink", 0xEF, 0x30, 0x38));
        colorList.add(new ColorName("Deep carrot orange", 0xE9, 0x69, 0x2C));
        colorList.add(new ColorName("Deep cerise", 0xDA, 0x32, 0x87));
        colorList.add(new ColorName("Deep champagne", 0xFA, 0xD6, 0xA5));
        colorList.add(new ColorName("Deep chestnut", 0xB9, 0x4E, 0x48));
        colorList.add(new ColorName("Deep coffee", 0x70, 0x42, 0x41));
        colorList.add(new ColorName("Deep fuchsia", 0xC1, 0x54, 0xC1));
        colorList.add(new ColorName("Deep jungle green", 0x00, 0x4B, 0x49));
        colorList.add(new ColorName("Deep lilac", 0x99, 0x55, 0xBB));
        colorList.add(new ColorName("Deep magenta", 0xCC, 0x00, 0xCC));
        colorList.add(new ColorName("Deep peach", 0xFF, 0xCB, 0xA4));
        colorList.add(new ColorName("Deep pink", 0xFF, 0x14, 0x93));
        colorList.add(new ColorName("Deep ruby", 0x84, 0x3F, 0x5B));
        colorList.add(new ColorName("Deep saffron", 0xFF, 0x99, 0x33));
        colorList.add(new ColorName("Deep sky blue", 0x00, 0xBF, 0xFF));
        colorList.add(new ColorName("Deep Tuscan red", 0x66, 0x42, 0x4D));
        colorList.add(new ColorName("Denim", 0x15, 0x60, 0xBD));
        colorList.add(new ColorName("Desert", 0xC1, 0x9A, 0x6B));
        colorList.add(new ColorName("Desert sand", 0xED, 0xC9, 0xAF));
        colorList.add(new ColorName("Dim gray", 0x69, 0x69, 0x69));
        colorList.add(new ColorName("Dodger blue", 0x1E, 0x90, 0xFF));
        colorList.add(new ColorName("Dogwood rose", 0xD7, 0x18, 0x68));
        colorList.add(new ColorName("Dollar bill", 0x85, 0xBB, 0x65));
        colorList.add(new ColorName("Drab", 0x96, 0x71, 0x17));
        colorList.add(new ColorName("Duke blue", 0x00, 0x00, 0x9C));
        colorList.add(new ColorName("Earth yellow", 0xE1, 0xA9, 0x5F));
        colorList.add(new ColorName("Ebony", 0x55, 0x5D, 0x50));
        colorList.add(new ColorName("Ecru", 0xC2, 0xB2, 0x80));
        colorList.add(new ColorName("Eggplant", 0x61, 0x40, 0x51));
        colorList.add(new ColorName("Eggshell", 0xF0, 0xEA, 0xD6));
        colorList.add(new ColorName("Egyptian blue", 0x10, 0x34, 0xA6));
        colorList.add(new ColorName("Electric blue", 0x7D, 0xF9, 0xFF));
        colorList.add(new ColorName("Electric crimson", 0xFF, 0x00, 0x3F));
        colorList.add(new ColorName("Electric cyan", 0x00, 0xFF, 0xFF));
        colorList.add(new ColorName("Electric green", 0x00, 0xFF, 0x00));
        colorList.add(new ColorName("Electric indigo", 0x6F, 0x00, 0xFF));
        colorList.add(new ColorName("Electric lavender", 0xF4, 0xBB, 0xFF));
        colorList.add(new ColorName("Electric lime", 0xCC, 0xFF, 0x00));
        colorList.add(new ColorName("Electric purple", 0xBF, 0x00, 0xFF));
        colorList.add(new ColorName("Electric ultramarine", 0x3F, 0x00, 0xFF));
        colorList.add(new ColorName("Electric violet", 0x8F, 0x00, 0xFF));
        colorList.add(new ColorName("Electric yellow", 0xFF, 0xFF, 0x00));
        colorList.add(new ColorName("Emerald", 0x50, 0xC8, 0x78));
        colorList.add(new ColorName("English lavender", 0xB4, 0x83, 0x95));
        colorList.add(new ColorName("Eton blue", 0x96, 0xC8, 0xA2));
        colorList.add(new ColorName("Fallow", 0xC1, 0x9A, 0x6B));
        colorList.add(new ColorName("Falu red", 0x80, 0x18, 0x18));
        colorList.add(new ColorName("Fandango", 0xB5, 0x33, 0x89));
        colorList.add(new ColorName("Fashion fuchsia", 0xF4, 0x00, 0xA1));
        colorList.add(new ColorName("Fawn", 0xE5, 0xAA, 0x70));
        colorList.add(new ColorName("Feldgrau", 0x4D, 0x5D, 0x53));
        colorList.add(new ColorName("Fern green", 0x4F, 0x79, 0x42));
        colorList.add(new ColorName("Ferrari Red", 0xFF, 0x28, 0x00));
        colorList.add(new ColorName("Field drab", 0x6C, 0x54, 0x1E));
        colorList.add(new ColorName("Firebrick", 0xB2, 0x22, 0x22));
        colorList.add(new ColorName("Fire engine red", 0xCE, 0x20, 0x29));
        colorList.add(new ColorName("Flame", 0xE2, 0x58, 0x22));
        colorList.add(new ColorName("Flamingo pink", 0xFC, 0x8E, 0xAC));
        colorList.add(new ColorName("Flavescent", 0xF7, 0xE9, 0x8E));
        colorList.add(new ColorName("Flax", 0xEE, 0xDC, 0x82));
        colorList.add(new ColorName("Floral white", 0xFF, 0xFA, 0xF0));
        colorList.add(new ColorName("Fluorescent orange", 0xFF, 0xBF, 0x00));
        colorList.add(new ColorName("Fluorescent pink", 0xFF, 0x14, 0x93));
        colorList.add(new ColorName("Fluorescent yellow", 0xCC, 0xFF, 0x00));
        colorList.add(new ColorName("Folly", 0xFF, 0x00, 0x4F));
        colorList.add(new ColorName("Forest green (traditional)", 0x01, 0x44, 0x21));
        colorList.add(new ColorName("Forest green (web)", 0x22, 0x8B, 0x22));
        colorList.add(new ColorName("French beige", 0xA6, 0x7B, 0x5B));
        colorList.add(new ColorName("French blue", 0x00, 0x72, 0xBB));
        colorList.add(new ColorName("French lilac", 0x86, 0x60, 0x8E));
        colorList.add(new ColorName("French lime", 0xCC, 0xFF, 0x00));
        colorList.add(new ColorName("French raspberry", 0xC7, 0x2C, 0x48));
        colorList.add(new ColorName("French rose", 0xF6, 0x4A, 0x8A));
        colorList.add(new ColorName("Fuchsia", 0xFF, 0x00, 0xFF));
        colorList.add(new ColorName("Fuchsia (Crayola)", 0xC1, 0x54, 0xC1));
        colorList.add(new ColorName("Fuchsia pink", 0xFF, 0x77, 0xFF));
        colorList.add(new ColorName("Fuchsia rose", 0xC7, 0x43, 0x75));
        colorList.add(new ColorName("Fulvous", 0xE4, 0x84, 0x00));
        colorList.add(new ColorName("Fuzzy Wuzzy", 0xCC, 0x66, 0x66));
        colorList.add(new ColorName("Gainsboro", 0xDC, 0xDC, 0xDC));
        colorList.add(new ColorName("Gamboge", 0xE4, 0x9B, 0x0F));
        colorList.add(new ColorName("Ghost white", 0xF8, 0xF8, 0xFF));
        colorList.add(new ColorName("Ginger", 0xB0, 0x65, 0x00));
        colorList.add(new ColorName("Glaucous", 0x60, 0x82, 0xB6));
        colorList.add(new ColorName("Glitter", 0xE6, 0xE8, 0xFA));
        colorList.add(new ColorName("Gold (metallic)", 0xD4, 0xAF, 0x37));
        colorList.add(new ColorName("Gold (web) (Golden)", 0xFF, 0xD7, 0x00));
        colorList.add(new ColorName("Golden brown", 0x99, 0x65, 0x15));
        colorList.add(new ColorName("Golden poppy", 0xFC, 0xC2, 0x00));
        colorList.add(new ColorName("Golden yellow", 0xFF, 0xDF, 0x00));
        colorList.add(new ColorName("Goldenrod", 0xDA, 0xA5, 0x20));
        colorList.add(new ColorName("Granny Smith Apple", 0xA8, 0xE4, 0xA0));
        colorList.add(new ColorName("Gray", 0x80, 0x80, 0x80));
        colorList.add(new ColorName("Gray (HTML/CSS gray)", 0x80, 0x80, 0x80));
        colorList.add(new ColorName("Gray (X11 gray)", 0xBE, 0xBE, 0xBE));
        colorList.add(new ColorName("Gray-asparagus", 0x46, 0x59, 0x45));
        colorList.add(new ColorName("Green (color wheel) (X11 green)", 0x00, 0xFF, 0x00));
        colorList.add(new ColorName("Green (Crayola)", 0x1C, 0xAC, 0x78));
        colorList.add(new ColorName("Green (HTML/CSS green)", 0x00, 0x80, 0x00));
        colorList.add(new ColorName("Green (Munsell)", 0x00, 0xA8, 0x77));
        colorList.add(new ColorName("Green (NCS)", 0x00, 0x9F, 0x6B));
        colorList.add(new ColorName("Green (pigment)", 0x00, 0xA5, 0x50));
        colorList.add(new ColorName("Green (RYB)", 0x66, 0xB0, 0x32));
        colorList.add(new ColorName("Green-yellow", 0xAD, 0xFF, 0x2F));
        colorList.add(new ColorName("Grullo", 0xA9, 0x9A, 0x86));
        colorList.add(new ColorName("Guppie green", 0x00, 0xFF, 0x7F));
        colorList.add(new ColorName("Halay� �be", 0x66, 0x38, 0x54));
        colorList.add(new ColorName("Han blue", 0x44, 0x6C, 0xCF));
        colorList.add(new ColorName("Han purple", 0x52, 0x18, 0xFA));
        colorList.add(new ColorName("Hansa yellow", 0xE9, 0xD6, 0x6B));
        colorList.add(new ColorName("Harlequin", 0x3F, 0xFF, 0x00));
        colorList.add(new ColorName("Harvard crimson", 0xC9, 0x00, 0x16));
        colorList.add(new ColorName("Harvest Gold", 0xDA, 0x91, 0x00));
        colorList.add(new ColorName("Heart Gold", 0x80, 0x80, 0x00));
        colorList.add(new ColorName("Heliotrope", 0xDF, 0x73, 0xFF));
        colorList.add(new ColorName("Hollywood cerise", 0xF4, 0x00, 0xA1));
        colorList.add(new ColorName("Honeydew", 0xF0, 0xFF, 0xF0));
        colorList.add(new ColorName("Honolulu Blue", 0x00, 0x7F, 0xBF));
        colorList.add(new ColorName("Hooker's green", 0x49, 0x79, 0x6B));
        colorList.add(new ColorName("Hot magenta", 0xFF, 0x1D, 0xCE));
        colorList.add(new ColorName("Hot pink", 0xFF, 0x69, 0xB4));
        colorList.add(new ColorName("Hunter green", 0x35, 0x5E, 0x3B));
        colorList.add(new ColorName("Iceberg", 0x71, 0xA6, 0xD2));
        colorList.add(new ColorName("Icterine", 0xFC, 0xF7, 0x5E));
        colorList.add(new ColorName("Imperial blue", 0x00, 0x23, 0x95));
        colorList.add(new ColorName("Inchworm", 0xB2, 0xEC, 0x5D));
        colorList.add(new ColorName("India green", 0x13, 0x88, 0x08));
        colorList.add(new ColorName("Indian red", 0xCD, 0x5C, 0x5C));
        colorList.add(new ColorName("Indian yellow", 0xE3, 0xA8, 0x57));
        colorList.add(new ColorName("Indigo", 0x6F, 0x00, 0xFF));
        colorList.add(new ColorName("Indigo (dye)", 0x00, 0x41, 0x6A));
        colorList.add(new ColorName("Indigo (web)", 0x4B, 0x00, 0x82));
        colorList.add(new ColorName("International Klein Blue", 0x00, 0x2F, 0xA7));
        colorList.add(new ColorName("International orange (aerospace)", 0xFF, 0x4F, 0x00));
        colorList.add(new ColorName("International orange (engineering)", 0xBA, 0x16, 0x0C));
        colorList.add(new ColorName("International orange (Golden Gate Bridge)", 0xC0, 0x36, 0x2C));
        colorList.add(new ColorName("Iris", 0x5A, 0x4F, 0xCF));
        colorList.add(new ColorName("Isabelline", 0xF4, 0xF0, 0xEC));
        colorList.add(new ColorName("Islamic green", 0x00, 0x90, 0x00));
        colorList.add(new ColorName("Ivory", 0xFF, 0xFF, 0xF0));
        colorList.add(new ColorName("Jade", 0x00, 0xA8, 0x6B));
        colorList.add(new ColorName("Jasmine", 0xF8, 0xDE, 0x7E));
        colorList.add(new ColorName("Jasper", 0xD7, 0x3B, 0x3E));
        colorList.add(new ColorName("Jazzberry jam", 0xA5, 0x0B, 0x5E));
        colorList.add(new ColorName("Jet", 0x34, 0x34, 0x34));
        colorList.add(new ColorName("Jonquil", 0xFA, 0xDA, 0x5E));
        colorList.add(new ColorName("June bud", 0xBD, 0xDA, 0x57));
        colorList.add(new ColorName("Jungle green", 0x29, 0xAB, 0x87));
        colorList.add(new ColorName("Kelly green", 0x4C, 0xBB, 0x17));
        colorList.add(new ColorName("Kenyan copper", 0x7C, 0x1C, 0x05));
        colorList.add(new ColorName("Khaki (HTML/CSS) (Khaki)", 0xC3, 0xB0, 0x91));
        colorList.add(new ColorName("Khaki (X11) (Light khaki)", 0xF0, 0xE6, 0x8C));
        colorList.add(new ColorName("KU Crimson", 0xE8, 0x00, 0x0D));
        colorList.add(new ColorName("La Salle Green", 0x08, 0x78, 0x30));
        colorList.add(new ColorName("Languid lavender", 0xD6, 0xCA, 0xDD));
        colorList.add(new ColorName("Lapis lazuli", 0x26, 0x61, 0x9C));
        colorList.add(new ColorName("Laser Lemon", 0xFE, 0xFE, 0x22));
        colorList.add(new ColorName("Laurel green", 0xA9, 0xBA, 0x9D));
        colorList.add(new ColorName("Lava", 0xCF, 0x10, 0x20));
        colorList.add(new ColorName("Lavender (floral)", 0xB5, 0x7E, 0xDC));
        colorList.add(new ColorName("Lavender (web)", 0xE6, 0xE6, 0xFA));
        colorList.add(new ColorName("Lavender blue", 0xCC, 0xCC, 0xFF));
        colorList.add(new ColorName("Lavender blush", 0xFF, 0xF0, 0xF5));
        colorList.add(new ColorName("Lavender gray", 0xC4, 0xC3, 0xD0));
        colorList.add(new ColorName("Lavender indigo", 0x94, 0x57, 0xEB));
        colorList.add(new ColorName("Lavender magenta", 0xEE, 0x82, 0xEE));
        colorList.add(new ColorName("Lavender mist", 0xE6, 0xE6, 0xFA));
        colorList.add(new ColorName("Lavender pink", 0xFB, 0xAE, 0xD2));
        colorList.add(new ColorName("Lavender purple", 0x96, 0x7B, 0xB6));
        colorList.add(new ColorName("Lavender rose", 0xFB, 0xA0, 0xE3));
        colorList.add(new ColorName("Lawn green", 0x7C, 0xFC, 0x00));
        colorList.add(new ColorName("Lemon", 0xFF, 0xF7, 0x00));
        colorList.add(new ColorName("Lemon chiffon", 0xFF, 0xFA, 0xCD));
        colorList.add(new ColorName("Lemon lime", 0xE3, 0xFF, 0x00));
        colorList.add(new ColorName("Licorice", 0x1A, 0x11, 0x10));
        colorList.add(new ColorName("Light apricot", 0xFD, 0xD5, 0xB1));
        colorList.add(new ColorName("Light blue", 0xAD, 0xD8, 0xE6));
        colorList.add(new ColorName("Light brown", 0xB5, 0x65, 0x1D));
        colorList.add(new ColorName("Light carmine pink", 0xE6, 0x67, 0x71));
        colorList.add(new ColorName("Light coral", 0xF0, 0x80, 0x80));
        colorList.add(new ColorName("Light cornflower blue", 0x93, 0xCC, 0xEA));
        colorList.add(new ColorName("Light crimson", 0xF5, 0x69, 0x91));
        colorList.add(new ColorName("Light cyan", 0xE0, 0xFF, 0xFF));
        colorList.add(new ColorName("Light fuchsia pink", 0xF9, 0x84, 0xEF));
        colorList.add(new ColorName("Light goldenrod yellow", 0xFA, 0xFA, 0xD2));
        colorList.add(new ColorName("Light gray", 0xD3, 0xD3, 0xD3));
        colorList.add(new ColorName("Light green", 0x90, 0xEE, 0x90));
        colorList.add(new ColorName("Light khaki", 0xF0, 0xE6, 0x8C));
        colorList.add(new ColorName("Light pastel purple", 0xB1, 0x9C, 0xD9));
        colorList.add(new ColorName("Light pink", 0xFF, 0xB6, 0xC1));
        colorList.add(new ColorName("Light red ochre", 0xE9, 0x74, 0x51));
        colorList.add(new ColorName("Light salmon", 0xFF, 0xA0, 0x7A));
        colorList.add(new ColorName("Light salmon pink", 0xFF, 0x99, 0x99));
        colorList.add(new ColorName("Light sea green", 0x20, 0xB2, 0xAA));
        colorList.add(new ColorName("Light sky blue", 0x87, 0xCE, 0xFA));
        colorList.add(new ColorName("Light slate gray", 0x77, 0x88, 0x99));
        colorList.add(new ColorName("Light taupe", 0xB3, 0x8B, 0x6D));
        colorList.add(new ColorName("Light Thulian pink", 0xE6, 0x8F, 0xAC));
        colorList.add(new ColorName("Light yellow", 0xFF, 0xFF, 0xE0));
        colorList.add(new ColorName("Lilac", 0xC8, 0xA2, 0xC8));
        colorList.add(new ColorName("Lime (color wheel)", 0xBF, 0xFF, 0x00));
        colorList.add(new ColorName("Lime (web) (X11 green)", 0x00, 0xFF, 0x00));
        colorList.add(new ColorName("Lime green", 0x32, 0xCD, 0x32));
        colorList.add(new ColorName("Limerick", 0x9D, 0xC2, 0x09));
        colorList.add(new ColorName("Lincoln green", 0x19, 0x59, 0x05));
        colorList.add(new ColorName("Linen", 0xFA, 0xF0, 0xE6));
        colorList.add(new ColorName("Lion", 0xC1, 0x9A, 0x6B));
        colorList.add(new ColorName("Little boy blue", 0x6C, 0xA0, 0xDC));
        colorList.add(new ColorName("Liver", 0x53, 0x4B, 0x4F));
        colorList.add(new ColorName("Lust", 0xE6, 0x20, 0x20));
        colorList.add(new ColorName("Magenta", 0xFF, 0x00, 0xFF));
        colorList.add(new ColorName("Magenta (dye)", 0xCA, 0x1F, 0x7B));
        colorList.add(new ColorName("Magenta (process)", 0xFF, 0x00, 0x90));
        colorList.add(new ColorName("Magic mint", 0xAA, 0xF0, 0xD1));
        colorList.add(new ColorName("Magnolia", 0xF8, 0xF4, 0xFF));
        colorList.add(new ColorName("Mahogany", 0xC0, 0x40, 0x00));
        colorList.add(new ColorName("Maize", 0xFB, 0xEC, 0x5D));
        colorList.add(new ColorName("Majorelle Blue", 0x60, 0x50, 0xDC));
        colorList.add(new ColorName("Malachite", 0x0B, 0xDA, 0x51));
        colorList.add(new ColorName("Manatee", 0x97, 0x9A, 0xAA));
        colorList.add(new ColorName("Mango Tango", 0xFF, 0x82, 0x43));
        colorList.add(new ColorName("Mantis", 0x74, 0xC3, 0x65));
        colorList.add(new ColorName("Mardi Gras", 0x88, 0x00, 0x85));
        colorList.add(new ColorName("Maroon (Crayola)", 0xC3, 0x21, 0x48));
        colorList.add(new ColorName("Maroon (HTML/CSS)", 0x80, 0x00, 0x00));
        colorList.add(new ColorName("Maroon (X11)", 0xB0, 0x30, 0x60));
        colorList.add(new ColorName("Mauve", 0xE0, 0xB0, 0xFF));
        colorList.add(new ColorName("Mauve taupe", 0x91, 0x5F, 0x6D));
        colorList.add(new ColorName("Mauvelous", 0xEF, 0x98, 0xAA));
        colorList.add(new ColorName("Maya blue", 0x73, 0xC2, 0xFB));
        colorList.add(new ColorName("Meat brown", 0xE5, 0xB7, 0x3B));
        colorList.add(new ColorName("Medium aquamarine", 0x66, 0xDD, 0xAA));
        colorList.add(new ColorName("Medium blue", 0x00, 0x00, 0xCD));
        colorList.add(new ColorName("Medium candy apple red", 0xE2, 0x06, 0x2C));
        colorList.add(new ColorName("Medium carmine", 0xAF, 0x40, 0x35));
        colorList.add(new ColorName("Medium champagne", 0xF3, 0xE5, 0xAB));
        colorList.add(new ColorName("Medium electric blue", 0x03, 0x50, 0x96));
        colorList.add(new ColorName("Medium jungle green", 0x1C, 0x35, 0x2D));
        colorList.add(new ColorName("Medium lavender magenta", 0xDD, 0xA0, 0xDD));
        colorList.add(new ColorName("Medium orchid", 0xBA, 0x55, 0xD3));
        colorList.add(new ColorName("Medium Persian blue", 0x00, 0x67, 0xA5));
        colorList.add(new ColorName("Medium purple", 0x93, 0x70, 0xDB));
        colorList.add(new ColorName("Medium red-violet", 0xBB, 0x33, 0x85));
        colorList.add(new ColorName("Medium ruby", 0xAA, 0x40, 0x69));
        colorList.add(new ColorName("Medium sea green", 0x3C, 0xB3, 0x71));
        colorList.add(new ColorName("Medium slate blue", 0x7B, 0x68, 0xEE));
        colorList.add(new ColorName("Medium spring bud", 0xC9, 0xDC, 0x87));
        colorList.add(new ColorName("Medium spring green", 0x00, 0xFA, 0x9A));
        colorList.add(new ColorName("Medium taupe", 0x67, 0x4C, 0x47));
        colorList.add(new ColorName("Medium turquoise", 0x48, 0xD1, 0xCC));
        colorList.add(new ColorName("Medium Tuscan red", 0x79, 0x44, 0x3B));
        colorList.add(new ColorName("Medium vermilion", 0xD9, 0x60, 0x3B));
        colorList.add(new ColorName("Medium violet-red", 0xC7, 0x15, 0x85));
        colorList.add(new ColorName("Mellow apricot", 0xF8, 0xB8, 0x78));
        colorList.add(new ColorName("Mellow yellow", 0xF8, 0xDE, 0x7E));
        colorList.add(new ColorName("Melon", 0xFD, 0xBC, 0xB4));
        colorList.add(new ColorName("Midnight blue", 0x19, 0x19, 0x70));
        colorList.add(new ColorName("Midnight green (eagle green)", 0x00, 0x49, 0x53));
        colorList.add(new ColorName("Mikado yellow", 0xFF, 0xC4, 0x0C));
        colorList.add(new ColorName("Mint", 0x3E, 0xB4, 0x89));
        colorList.add(new ColorName("Mint cream", 0xF5, 0xFF, 0xFA));
        initAdvancedColorList2();
    }

    private void initAdvancedColorList2()
    {
        colorList.add(new ColorName("Mint green", 0x98, 0xFF, 0x98));
        colorList.add(new ColorName("Misty rose", 0xFF, 0xE4, 0xE1));
        colorList.add(new ColorName("Moccasin", 0xFA, 0xEB, 0xD7));
        colorList.add(new ColorName("Mode beige", 0x96, 0x71, 0x17));
        colorList.add(new ColorName("Moonstone blue", 0x73, 0xA9, 0xC2));
        colorList.add(new ColorName("Mordant red 19", 0xAE, 0x0C, 0x00));
        colorList.add(new ColorName("Moss green", 0xAD, 0xDF, 0xAD));
        colorList.add(new ColorName("Mountain Meadow", 0x30, 0xBA, 0x8F));
        colorList.add(new ColorName("Mountbatten pink", 0x99, 0x7A, 0x8D));
        colorList.add(new ColorName("Mulberry", 0xC5, 0x4B, 0x8C));
        colorList.add(new ColorName("Mustard", 0xFF, 0xDB, 0x58));
        colorList.add(new ColorName("Myrtle", 0x21, 0x42, 0x1E));
        colorList.add(new ColorName("MSU Green", 0x18, 0x45, 0x3B));
        colorList.add(new ColorName("Nadeshiko pink", 0xF6, 0xAD, 0xC6));
        colorList.add(new ColorName("Napier green", 0x2A, 0x80, 0x00));
        colorList.add(new ColorName("Naples yellow", 0xFA, 0xDA, 0x5E));
        colorList.add(new ColorName("Navajo white", 0xFF, 0xDE, 0xAD));
        colorList.add(new ColorName("Navy blue", 0x00, 0x00, 0x80));
        colorList.add(new ColorName("Neon Carrot", 0xFF, 0xA3, 0x43));
        colorList.add(new ColorName("Neon fuchsia", 0xFE, 0x41, 0x64));
        colorList.add(new ColorName("Neon green", 0x39, 0xFF, 0x14));
        colorList.add(new ColorName("New York pink", 0xD7, 0x83, 0x7F));
        colorList.add(new ColorName("Non-photo blue", 0xA4, 0xDD, 0xED));
        colorList.add(new ColorName("North Texas Green", 0x05, 0x90, 0x33));
        colorList.add(new ColorName("Ocean Boat Blue", 0x00, 0x77, 0xBE));
        colorList.add(new ColorName("Ochre", 0xCC, 0x77, 0x22));
        colorList.add(new ColorName("Office green", 0x00, 0x80, 0x00));
        colorList.add(new ColorName("Old gold", 0xCF, 0xB5, 0x3B));
        colorList.add(new ColorName("Old lace", 0xFD, 0xF5, 0xE6));
        colorList.add(new ColorName("Old lavender", 0x79, 0x68, 0x78));
        colorList.add(new ColorName("Old mauve", 0x67, 0x31, 0x47));
        colorList.add(new ColorName("Old rose", 0xC0, 0x80, 0x81));
        colorList.add(new ColorName("Olive", 0x80, 0x80, 0x00));
        colorList.add(new ColorName("Olive Drab (web) (Olive Drab #3) ", 0x6B, 0x8E, 0x23));
        colorList.add(new ColorName("Olive Drab", 0x3C, 0x34, 0x1F));     //3C341F
        colorList.add(new ColorName("Olivine", 0x9A, 0xB9, 0x73));
        colorList.add(new ColorName("Onyx", 0x35, 0x38, 0x39));
        colorList.add(new ColorName("Opera mauve", 0xB7, 0x84, 0xA7));
        colorList.add(new ColorName("Orange (color wheel)", 0xFF, 0x7F, 0x00));
        colorList.add(new ColorName("Orange (RYB)", 0xFB, 0x99, 0x02));
        colorList.add(new ColorName("Orange (web color)", 0xFF, 0xA5, 0x00));
        colorList.add(new ColorName("Orange peel", 0xFF, 0x9F, 0x00));
        colorList.add(new ColorName("Orange-red", 0xFF, 0x45, 0x00));
        colorList.add(new ColorName("Orchid", 0xDA, 0x70, 0xD6));
        colorList.add(new ColorName("Otter brown", 0x65, 0x43, 0x21));
        colorList.add(new ColorName("Outer Space", 0x41, 0x4A, 0x4C));
        colorList.add(new ColorName("Outrageous Orange", 0xFF, 0x6E, 0x4A));
        colorList.add(new ColorName("Oxford Blue", 0x00, 0x21, 0x47));
        colorList.add(new ColorName("OU Crimson Red", 0x99, 0x00, 0x00));
        colorList.add(new ColorName("Pakistan green", 0x00, 0x66, 0x00));
        colorList.add(new ColorName("Palatinate blue", 0x27, 0x3B, 0xE2));
        colorList.add(new ColorName("Palatinate purple", 0x68, 0x28, 0x60));
        colorList.add(new ColorName("Pale aqua", 0xBC, 0xD4, 0xE6));
        colorList.add(new ColorName("Pale blue", 0xAF, 0xEE, 0xEE));
        colorList.add(new ColorName("Pale brown", 0x98, 0x76, 0x54));
        colorList.add(new ColorName("Pale carmine", 0xAF, 0x40, 0x35));
        colorList.add(new ColorName("Pale cerulean", 0x9B, 0xC4, 0xE2));
        colorList.add(new ColorName("Pale chestnut", 0xDD, 0xAD, 0xAF));
        colorList.add(new ColorName("Pale copper", 0xDA, 0x8A, 0x67));
        colorList.add(new ColorName("Pale cornflower blue", 0xAB, 0xCD, 0xEF));
        colorList.add(new ColorName("Pale gold", 0xE6, 0xBE, 0x8A));
        colorList.add(new ColorName("Pale goldenrod", 0xEE, 0xE8, 0xAA));
        colorList.add(new ColorName("Pale green", 0x98, 0xFB, 0x98));
        colorList.add(new ColorName("Pale lavender", 0xDC, 0xD0, 0xFF));
        colorList.add(new ColorName("Pale magenta", 0xF9, 0x84, 0xE5));
        colorList.add(new ColorName("Pale pink", 0xFA, 0xDA, 0xDD));
        colorList.add(new ColorName("Pale plum", 0xDD, 0xA0, 0xDD));
        colorList.add(new ColorName("Pale red-violet", 0xDB, 0x70, 0x93));
        colorList.add(new ColorName("Pale robin egg blue", 0x96, 0xDE, 0xD1));
        colorList.add(new ColorName("Pale silver", 0xC9, 0xC0, 0xBB));
        colorList.add(new ColorName("Pale spring bud", 0xEC, 0xEB, 0xBD));
        colorList.add(new ColorName("Pale taupe", 0xBC, 0x98, 0x7E));
        colorList.add(new ColorName("Pale violet-red", 0xDB, 0x70, 0x93));
        colorList.add(new ColorName("Pansy purple", 0x78, 0x18, 0x4A));
        colorList.add(new ColorName("Papaya whip", 0xFF, 0xEF, 0xD5));
        colorList.add(new ColorName("Paris Green", 0x50, 0xC8, 0x78));
        colorList.add(new ColorName("Pastel blue", 0xAE, 0xC6, 0xCF));
        colorList.add(new ColorName("Pastel brown", 0x83, 0x69, 0x53));
        colorList.add(new ColorName("Pastel gray", 0xCF, 0xCF, 0xC4));
        colorList.add(new ColorName("Pastel green", 0x77, 0xDD, 0x77));
        colorList.add(new ColorName("Pastel magenta", 0xF4, 0x9A, 0xC2));
        colorList.add(new ColorName("Pastel orange", 0xFF, 0xB3, 0x47));
        colorList.add(new ColorName("Pastel pink", 0xDE, 0xA5, 0xA4));
        colorList.add(new ColorName("Pastel purple", 0xB3, 0x9E, 0xB5));
        colorList.add(new ColorName("Pastel red", 0xFF, 0x69, 0x61));
        colorList.add(new ColorName("Pastel violet", 0xCB, 0x99, 0xC9));
        colorList.add(new ColorName("Pastel yellow", 0xFD, 0xFD, 0x96));
        colorList.add(new ColorName("Patriarch", 0x80, 0x00, 0x80));
        colorList.add(new ColorName("Payne's grey", 0x53, 0x68, 0x78));
        colorList.add(new ColorName("Peach", 0xFF, 0xE5, 0xB4));
        colorList.add(new ColorName("Peach (Crayola)", 0xFF, 0xCB, 0xA4));
        colorList.add(new ColorName("Peach-orange", 0xFF, 0xCC, 0x99));
        colorList.add(new ColorName("Peach puff", 0xFF, 0xDA, 0xB9));
        colorList.add(new ColorName("Peach-yellow", 0xFA, 0xDF, 0xAD));
        colorList.add(new ColorName("Pear", 0xD1, 0xE2, 0x31));
        colorList.add(new ColorName("Pearl", 0xEA, 0xE0, 0xC8));
        colorList.add(new ColorName("Pearl Aqua", 0x88, 0xD8, 0xC0));
        colorList.add(new ColorName("Pearly purple", 0xB7, 0x68, 0xA2));
        colorList.add(new ColorName("Peridot", 0xE6, 0xE2, 0x00));
        colorList.add(new ColorName("Periwinkle", 0xCC, 0xCC, 0xFF));
        colorList.add(new ColorName("Persian blue", 0x1C, 0x39, 0xBB));
        colorList.add(new ColorName("Persian green", 0x00, 0xA6, 0x93));
        colorList.add(new ColorName("Persian indigo", 0x32, 0x12, 0x7A));
        colorList.add(new ColorName("Persian orange", 0xD9, 0x90, 0x58));
        colorList.add(new ColorName("Persian pink", 0xF7, 0x7F, 0xBE));
        colorList.add(new ColorName("Persian plum", 0x70, 0x1C, 0x1C));
        colorList.add(new ColorName("Persian red", 0xCC, 0x33, 0x33));
        colorList.add(new ColorName("Persian rose", 0xFE, 0x28, 0xA2));
        colorList.add(new ColorName("Persimmon", 0xEC, 0x58, 0x00));
        colorList.add(new ColorName("Peru", 0xCD, 0x85, 0x3F));
        colorList.add(new ColorName("Phlox", 0xDF, 0x00, 0xFF));
        colorList.add(new ColorName("Phthalo blue", 0x00, 0x0F, 0x89));
        colorList.add(new ColorName("Phthalo green", 0x12, 0x35, 0x24));
        colorList.add(new ColorName("Piggy pink", 0xFD, 0xDD, 0xE6));
        colorList.add(new ColorName("Pine green", 0x01, 0x79, 0x6F));
        colorList.add(new ColorName("Pink", 0xFF, 0xC0, 0xCB));
        colorList.add(new ColorName("Pink lace", 0xFF, 0xDD, 0xF4));
        colorList.add(new ColorName("Pink-orange", 0xFF, 0x99, 0x66));
        colorList.add(new ColorName("Pink pearl", 0xE7, 0xAC, 0xCF));
        colorList.add(new ColorName("Pink Sherbet", 0xF7, 0x8F, 0xA7));
        colorList.add(new ColorName("Pistachio", 0x93, 0xC5, 0x72));
        colorList.add(new ColorName("Platinum", 0xE5, 0xE4, 0xE2));
        colorList.add(new ColorName("Plum (traditional)", 0x8E, 0x45, 0x85));
        colorList.add(new ColorName("Plum (web)", 0xDD, 0xA0, 0xDD));
        colorList.add(new ColorName("Portland Orange", 0xFF, 0x5A, 0x36));
        colorList.add(new ColorName("Powder blue (web)", 0xB0, 0xE0, 0xE6));
        colorList.add(new ColorName("Princeton orange", 0xFF, 0x8F, 0x00));
        colorList.add(new ColorName("Prune", 0x70, 0x1C, 0x1C));
        colorList.add(new ColorName("Prussian blue", 0x00, 0x31, 0x53));
        colorList.add(new ColorName("Psychedelic purple", 0xDF, 0x00, 0xFF));
        colorList.add(new ColorName("Puce", 0xCC, 0x88, 0x99));
        colorList.add(new ColorName("Pumpkin", 0xFF, 0x75, 0x18));
        colorList.add(new ColorName("Purple (HTML/CSS)", 0x80, 0x00, 0x80));
        colorList.add(new ColorName("Purple (Munsell)", 0x9F, 0x00, 0xC5));
        colorList.add(new ColorName("Purple (X11)", 0xA0, 0x20, 0xF0));
        colorList.add(new ColorName("Purple Heart", 0x69, 0x35, 0x9C));
        colorList.add(new ColorName("Purple mountain majesty", 0x96, 0x78, 0xB6));
        colorList.add(new ColorName("Purple pizzazz", 0xFE, 0x4E, 0xDA));
        colorList.add(new ColorName("Purple taupe", 0x50, 0x40, 0x4D));
        colorList.add(new ColorName("Quartz", 0x51, 0x48, 0x4F));
        colorList.add(new ColorName("Rackley", 0x5D, 0x8A, 0xA8));
        colorList.add(new ColorName("Radical Red", 0xFF, 0x35, 0x5E));
        colorList.add(new ColorName("Rajah", 0xFB, 0xAB, 0x60));
        colorList.add(new ColorName("Raspberry", 0xE3, 0x0B, 0x5D));
        colorList.add(new ColorName("Raspberry glace", 0x91, 0x5F, 0x6D));
        colorList.add(new ColorName("Raspberry pink", 0xE2, 0x50, 0x98));
        colorList.add(new ColorName("Raspberry rose", 0xB3, 0x44, 0x6C));
        colorList.add(new ColorName("Raw umber", 0x82, 0x66, 0x44));
        colorList.add(new ColorName("Razzle dazzle rose", 0xFF, 0x33, 0xCC));
        colorList.add(new ColorName("Razzmatazz", 0xE3, 0x25, 0x6B));
        colorList.add(new ColorName("Red", 0xFF, 0x00, 0x00));
        colorList.add(new ColorName("Red (Munsell)", 0xF2, 0x00, 0x3C));
        colorList.add(new ColorName("Red (NCS)", 0xC4, 0x02, 0x33));
        colorList.add(new ColorName("Red (pigment)", 0xED, 0x1C, 0x24));
        colorList.add(new ColorName("Red (RYB)", 0xFE, 0x27, 0x12));
        colorList.add(new ColorName("Red-brown", 0xA5, 0x2A, 0x2A));
        colorList.add(new ColorName("Red devil", 0x86, 0x01, 0x11));
        colorList.add(new ColorName("Red-orange", 0xFF, 0x53, 0x49));
        colorList.add(new ColorName("Red-violet", 0xC7, 0x15, 0x85));
        colorList.add(new ColorName("Redwood", 0xAB, 0x4E, 0x52));
        colorList.add(new ColorName("Regalia", 0x52, 0x2D, 0x80));
        colorList.add(new ColorName("Resolution blue", 0x00, 0x23, 0x87));
        colorList.add(new ColorName("Rich black", 0x00, 0x40, 0x40));
        colorList.add(new ColorName("Rich brilliant lavender", 0xF1, 0xA7, 0xFE));
        colorList.add(new ColorName("Rich carmine", 0xD7, 0x00, 0x40));
        colorList.add(new ColorName("Rich electric blue", 0x08, 0x92, 0xD0));
        colorList.add(new ColorName("Rich lavender", 0xA7, 0x6B, 0xCF));
        colorList.add(new ColorName("Rich lilac", 0xB6, 0x66, 0xD2));
        colorList.add(new ColorName("Rich maroon", 0xB0, 0x30, 0x60));
        colorList.add(new ColorName("Rifle green", 0x41, 0x48, 0x33));
        colorList.add(new ColorName("Robin egg blue", 0x00, 0xCC, 0xCC));
        colorList.add(new ColorName("Rose", 0xFF, 0x00, 0x7F));
        colorList.add(new ColorName("Rose bonbon", 0xF9, 0x42, 0x9E));
        colorList.add(new ColorName("Rose ebony", 0x67, 0x48, 0x46));
        colorList.add(new ColorName("Rose gold", 0xB7, 0x6E, 0x79));
        colorList.add(new ColorName("Rose madder", 0xE3, 0x26, 0x36));
        colorList.add(new ColorName("Rose pink", 0xFF, 0x66, 0xCC));
        colorList.add(new ColorName("Rose quartz", 0xAA, 0x98, 0xA9));
        colorList.add(new ColorName("Rose taupe", 0x90, 0x5D, 0x5D));
        colorList.add(new ColorName("Rose vale", 0xAB, 0x4E, 0x52));
        colorList.add(new ColorName("Rosewood", 0x65, 0x00, 0x0B));
        colorList.add(new ColorName("Rosso corsa", 0xD4, 0x00, 0x00));
        colorList.add(new ColorName("Rosy brown", 0xBC, 0x8F, 0x8F));
        colorList.add(new ColorName("Royal azure", 0x00, 0x38, 0xA8));
        colorList.add(new ColorName("Royal blue (traditional)", 0x00, 0x23, 0x66));
        colorList.add(new ColorName("Royal blue (web)", 0x41, 0x69, 0xE1));
        colorList.add(new ColorName("Royal fuchsia", 0xCA, 0x2C, 0x92));
        colorList.add(new ColorName("Royal purple", 0x78, 0x51, 0xA9));
        colorList.add(new ColorName("Royal yellow", 0xFA, 0xDA, 0x5E));
        colorList.add(new ColorName("Rubine red", 0xD1, 0x00, 0x56));
        colorList.add(new ColorName("Ruby", 0xE0, 0x11, 0x5F));
        colorList.add(new ColorName("Ruby red", 0x9B, 0x11, 0x1E));
        colorList.add(new ColorName("Ruddy", 0xFF, 0x00, 0x28));
        colorList.add(new ColorName("Ruddy brown", 0xBB, 0x65, 0x28));
        colorList.add(new ColorName("Ruddy pink", 0xE1, 0x8E, 0x96));
        colorList.add(new ColorName("Rufous", 0xA8, 0x1C, 0x07));
        colorList.add(new ColorName("Russet", 0x80, 0x46, 0x1B));
        colorList.add(new ColorName("Rust", 0xB7, 0x41, 0x0E));
        colorList.add(new ColorName("Rusty red", 0xDA, 0x2C, 0x43));
        colorList.add(new ColorName("Sacramento State green", 0x00, 0x56, 0x3F));
        colorList.add(new ColorName("Saddle brown", 0x8B, 0x45, 0x13));
        colorList.add(new ColorName("Safety orange (blaze orange)", 0xFF, 0x67, 0x00));
        colorList.add(new ColorName("Saffron", 0xF4, 0xC4, 0x30));
        colorList.add(new ColorName("St. Patrick's blue", 0x23, 0x29, 0x7A));
        colorList.add(new ColorName("Salmon", 0xFF, 0x8C, 0x69));
        colorList.add(new ColorName("Salmon pink", 0xFF, 0x91, 0xA4));
        colorList.add(new ColorName("Sand", 0xC2, 0xB2, 0x80));
        colorList.add(new ColorName("Sand dune", 0x96, 0x71, 0x17));
        colorList.add(new ColorName("Sandstorm", 0xEC, 0xD5, 0x40));
        colorList.add(new ColorName("Sandy brown", 0xF4, 0xA4, 0x60));
        colorList.add(new ColorName("Sandy taupe", 0x96, 0x71, 0x17));
        colorList.add(new ColorName("Sangria", 0x92, 0x00, 0x0A));
        colorList.add(new ColorName("Sap green", 0x50, 0x7D, 0x2A));
        colorList.add(new ColorName("Sapphire", 0x0F, 0x52, 0xBA));
        colorList.add(new ColorName("Sapphire blue", 0x00, 0x67, 0xA5));
        colorList.add(new ColorName("Satin sheen gold", 0xCB, 0xA1, 0x35));
        colorList.add(new ColorName("Scarlet", 0xFF, 0x24, 0x00));
        colorList.add(new ColorName("Scarlet (Crayola)", 0xFD, 0x0E, 0x35));
        colorList.add(new ColorName("School bus yellow", 0xFF, 0xD8, 0x00));
        colorList.add(new ColorName("Screamin' Green", 0x76, 0xFF, 0x7A));
        colorList.add(new ColorName("Sea blue", 0x00, 0x69, 0x94));
        colorList.add(new ColorName("Sea green", 0x2E, 0x8B, 0x57));
        colorList.add(new ColorName("Seal brown", 0x32, 0x14, 0x14));
        colorList.add(new ColorName("Seashell", 0xFF, 0xF5, 0xEE));
        colorList.add(new ColorName("Selective yellow", 0xFF, 0xBA, 0x00));
        colorList.add(new ColorName("Sepia", 0x70, 0x42, 0x14));
        colorList.add(new ColorName("Shadow", 0x8A, 0x79, 0x5D));
        colorList.add(new ColorName("Shamrock green", 0x00, 0x9E, 0x60));
        colorList.add(new ColorName("Shocking pink", 0xFC, 0x0F, 0xC0));
        colorList.add(new ColorName("Shocking pink (Crayola)", 0xFF, 0x6F, 0xFF));
        colorList.add(new ColorName("Sienna", 0x88, 0x2D, 0x17));
        colorList.add(new ColorName("Silver", 0xC0, 0xC0, 0xC0));
        colorList.add(new ColorName("Sinopia", 0xCB, 0x41, 0x0B));
        colorList.add(new ColorName("Skobeloff", 0x00, 0x74, 0x74));
        colorList.add(new ColorName("Sky blue", 0x87, 0xCE, 0xEB));
        colorList.add(new ColorName("Sky magenta", 0xCF, 0x71, 0xAF));
        colorList.add(new ColorName("Slate blue", 0x6A, 0x5A, 0xCD));
        colorList.add(new ColorName("Slate gray", 0x70, 0x80, 0x90));
        colorList.add(new ColorName("Smalt (Dark powder blue)", 0x00, 0x33, 0x99));
        colorList.add(new ColorName("Smokey topaz", 0x93, 0x3D, 0x41));
        colorList.add(new ColorName("Smoky black", 0x10, 0x0C, 0x08));
        colorList.add(new ColorName("Snow", 0xFF, 0xFA, 0xFA));
        colorList.add(new ColorName("Spiro Disco Ball", 0x0F, 0xC0, 0xFC));
        colorList.add(new ColorName("Spring bud", 0xA7, 0xFC, 0x00));
        colorList.add(new ColorName("Spring green", 0x00, 0xFF, 0x7F));
        colorList.add(new ColorName("Steel blue", 0x46, 0x82, 0xB4));
        colorList.add(new ColorName("Stil de grain yellow", 0xFA, 0xDA, 0x5E));
        colorList.add(new ColorName("Stizza", 0x99, 0x00, 0x00));
        colorList.add(new ColorName("Stormcloud", 0x4F, 0x66, 0x6A));
        colorList.add(new ColorName("Straw", 0xE4, 0xD9, 0x6F));
        colorList.add(new ColorName("Sunglow", 0xFF, 0xCC, 0x33));
        colorList.add(new ColorName("Sunset", 0xFA, 0xD6, 0xA5));
        colorList.add(new ColorName("Tan", 0xD2, 0xB4, 0x8C));
        colorList.add(new ColorName("Tangelo", 0xF9, 0x4D, 0x00));
        colorList.add(new ColorName("Tangerine", 0xF2, 0x85, 0x00));
        colorList.add(new ColorName("Tangerine yellow", 0xFF, 0xCC, 0x00));
        colorList.add(new ColorName("Tango pink", 0xE4, 0x71, 0x7A));
        colorList.add(new ColorName("Taupe", 0x48, 0x3C, 0x32));
        colorList.add(new ColorName("Taupe gray", 0x8B, 0x85, 0x89));
        colorList.add(new ColorName("Tea green", 0xD0, 0xF0, 0xC0));
        colorList.add(new ColorName("Tea rose (orange)", 0xF8, 0x83, 0x79));
        colorList.add(new ColorName("Tea rose (rose)", 0xF4, 0xC2, 0xC2));
        colorList.add(new ColorName("Teal", 0x00, 0x80, 0x80));
        colorList.add(new ColorName("Teal blue", 0x36, 0x75, 0x88));
        colorList.add(new ColorName("Teal green", 0x00, 0x82, 0x7F));
        colorList.add(new ColorName("Telemagenta", 0xCF, 0x34, 0x76));
        colorList.add(new ColorName("Tenn� (Tawny)", 0xCD, 0x57, 0x00));
        colorList.add(new ColorName("Terra cotta", 0xE2, 0x72, 0x5B));
        colorList.add(new ColorName("Thistle", 0xD8, 0xBF, 0xD8));
        colorList.add(new ColorName("Thulian pink", 0xDE, 0x6F, 0xA1));
        colorList.add(new ColorName("Tickle Me Pink", 0xFC, 0x89, 0xAC));
        colorList.add(new ColorName("Tiffany Blue", 0x0A, 0xBA, 0xB5));
        colorList.add(new ColorName("Tiger's eye", 0xE0, 0x8D, 0x3C));
        colorList.add(new ColorName("Timberwolf", 0xDB, 0xD7, 0xD2));
        colorList.add(new ColorName("Titanium yellow", 0xEE, 0xE6, 0x00));
        colorList.add(new ColorName("Tomato", 0xFF, 0x63, 0x47));
        colorList.add(new ColorName("Toolbox", 0x74, 0x6C, 0xC0));
        colorList.add(new ColorName("Topaz", 0xFF, 0xC8, 0x7C));
        colorList.add(new ColorName("Tractor red", 0xFD, 0x0E, 0x35));
        colorList.add(new ColorName("Trolley Grey", 0x80, 0x80, 0x80));
        colorList.add(new ColorName("Tropical rain forest", 0x00, 0x75, 0x5E));
        colorList.add(new ColorName("True Blue", 0x00, 0x73, 0xCF));
        colorList.add(new ColorName("Tufts Blue", 0x41, 0x7D, 0xC1));
        colorList.add(new ColorName("Tumbleweed", 0xDE, 0xAA, 0x88));
        colorList.add(new ColorName("Turkish rose", 0xB5, 0x72, 0x81));
        colorList.add(new ColorName("Turquoise", 0x30, 0xD5, 0xC8));
        colorList.add(new ColorName("Turquoise blue", 0x00, 0xFF, 0xEF));
        colorList.add(new ColorName("Turquoise green", 0xA0, 0xD6, 0xB4));
        colorList.add(new ColorName("Tuscan red", 0x7C, 0x48, 0x48));
        colorList.add(new ColorName("Twilight lavender", 0x8A, 0x49, 0x6B));
        colorList.add(new ColorName("Tyrian purple", 0x66, 0x02, 0x3C));
        colorList.add(new ColorName("UA blue", 0x00, 0x33, 0xAA));
        colorList.add(new ColorName("UA red", 0xD9, 0x00, 0x4C));
        colorList.add(new ColorName("Ube", 0x88, 0x78, 0xC3));
        colorList.add(new ColorName("UCLA Blue", 0x53, 0x68, 0x95));
        colorList.add(new ColorName("UCLA Gold", 0xFF, 0xB3, 0x00));
        colorList.add(new ColorName("UFO Green", 0x3C, 0xD0, 0x70));
        colorList.add(new ColorName("Ultramarine", 0x12, 0x0A, 0x8F));
        colorList.add(new ColorName("Ultramarine blue", 0x41, 0x66, 0xF5));
        colorList.add(new ColorName("Ultra pink", 0xFF, 0x6F, 0xFF));
        colorList.add(new ColorName("Umber", 0x63, 0x51, 0x47));
        colorList.add(new ColorName("Unbleached silk", 0xFF, 0xDD, 0xCA));
        colorList.add(new ColorName("United Nations blue", 0x5B, 0x92, 0xE5));
        colorList.add(new ColorName("University of California Gold", 0xB7, 0x87, 0x27));
        colorList.add(new ColorName("Unmellow Yellow", 0xFF, 0xFF, 0x66));
        colorList.add(new ColorName("UP Forest green", 0x01, 0x44, 0x21));
        colorList.add(new ColorName("UP Maroon", 0x7B, 0x11, 0x13));
        colorList.add(new ColorName("Upsdell red", 0xAE, 0x20, 0x29));
        colorList.add(new ColorName("Urobilin", 0xE1, 0xAD, 0x21));
        colorList.add(new ColorName("USAFA blue", 0x00, 0x4F, 0x98));
        colorList.add(new ColorName("USC Cardinal", 0x99, 0x00, 0x00));
        colorList.add(new ColorName("USC Gold", 0xFF, 0xCC, 0x00));
        colorList.add(new ColorName("Utah Crimson", 0xD3, 0x00, 0x3F));
        colorList.add(new ColorName("Vanilla", 0xF3, 0xE5, 0xAB));
        colorList.add(new ColorName("Vegas gold", 0xC5, 0xB3, 0x58));
        colorList.add(new ColorName("Venetian red", 0xC8, 0x08, 0x15));
        colorList.add(new ColorName("Verdigris", 0x43, 0xB3, 0xAE));
        colorList.add(new ColorName("Vermilion (cinnabar)", 0xE3, 0x42, 0x34));
        colorList.add(new ColorName("Vermilion (Plochere)", 0xD9, 0x60, 0x3B));
        colorList.add(new ColorName("Veronica", 0xA0, 0x20, 0xF0));
        colorList.add(new ColorName("Violet", 0x8F, 0x00, 0xFF));
        colorList.add(new ColorName("Violet (color wheel)", 0x7F, 0x00, 0xFF));
        colorList.add(new ColorName("Violet (RYB)", 0x86, 0x01, 0xAF));
        colorList.add(new ColorName("Violet (web)", 0xEE, 0x82, 0xEE));
        colorList.add(new ColorName("Violet-blue", 0x32, 0x4A, 0xB2));
        colorList.add(new ColorName("Viridian", 0x40, 0x82, 0x6D));
        colorList.add(new ColorName("Vivid auburn", 0x92, 0x27, 0x24));
        colorList.add(new ColorName("Vivid burgundy", 0x9F, 0x1D, 0x35));
        colorList.add(new ColorName("Vivid cerise", 0xDA, 0x1D, 0x81));
        colorList.add(new ColorName("Vivid tangerine", 0xFF, 0xA0, 0x89));
        colorList.add(new ColorName("Vivid violet", 0x9F, 0x00, 0xFF));
        colorList.add(new ColorName("Warm black", 0x00, 0x42, 0x42));
        colorList.add(new ColorName("Waterspout", 0xA4, 0xF4, 0xF9));
        colorList.add(new ColorName("Wenge", 0x64, 0x54, 0x52));
        colorList.add(new ColorName("Wheat", 0xF5, 0xDE, 0xB3));
        colorList.add(new ColorName("White", 0xFF, 0xFF, 0xFF));
        colorList.add(new ColorName("White smoke", 0xF5, 0xF5, 0xF5));
        colorList.add(new ColorName("Wild blue yonder", 0xA2, 0xAD, 0xD0));
        colorList.add(new ColorName("Wild Strawberry", 0xFF, 0x43, 0xA4));
        colorList.add(new ColorName("Wild Watermelon", 0xFC, 0x6C, 0x85));
        colorList.add(new ColorName("Wine", 0x72, 0x2F, 0x37));
        colorList.add(new ColorName("Wine dregs", 0x67, 0x31, 0x47));
        colorList.add(new ColorName("Wisteria", 0xC9, 0xA0, 0xDC));
        colorList.add(new ColorName("Wood brown", 0xC1, 0x9A, 0x6B));
        colorList.add(new ColorName("Xanadu", 0x73, 0x86, 0x78));
        colorList.add(new ColorName("Yale Blue", 0x0F, 0x4D, 0x92));
        colorList.add(new ColorName("Yellow", 0xFF, 0xFF, 0x00));
        colorList.add(new ColorName("Yellow (Munsell)", 0xEF, 0xCC, 0x00));
        colorList.add(new ColorName("Yellow (NCS)", 0xFF, 0xD3, 0x00));
        colorList.add(new ColorName("Yellow (process)", 0xFF, 0xEF, 0x00));
        colorList.add(new ColorName("Yellow (RYB)", 0xFE, 0xFE, 0x33));
        colorList.add(new ColorName("Yellow-green", 0x9A, 0xCD, 0x32));
        colorList.add(new ColorName("Yellow Orange", 0xFF, 0xAE, 0x42));
        colorList.add(new ColorName("Zaffre", 0x00, 0x14, 0xA8));
        colorList.add(new ColorName("Zinnwaldite brown", 0x2C, 0x16, 0x08));

    }
    //</editor-fold>

    /**
     * Get the closest color name from our list
     *
     * @param r
     * @param g
     * @param b
     * @return
     */
    public String getColorNameFromRgb(int r, int g, int b)
    {

        int minMSE = Integer.MAX_VALUE;
        ColorName closestMatch = null;
        int mse;
        for (ColorName c : colorList)
        {
            mse = c.computeMSE(r, g, b);
            if (mse < minMSE)
            {
                minMSE = mse;
                closestMatch = c;
            }
        }

        if (closestMatch != null)
        {
            return closestMatch.getName();
        } else
        {
            return "No matched color name.";
        }
    }

    public ColorName getColorFromName(String name)
    {
        for (ColorName c : colorList)
        {
            if (name.equals(c.getName()))
            {
                return c;
            }
        }
        return null;
    }

    /**
     * Convert hexColor to rgb, then call getColorNameFromRgb(r, g, b)
     *
     * @param hexColor
     * @return
     */
    public String getColorNameFromHex(int hexColor)
    {
        int r = (hexColor & 0xFF0000) >> 16;
        int g = (hexColor & 0xFF00) >> 8;
        int b = (hexColor & 0xFF);
        return getColorNameFromRgb(r, g, b);
    }

//    public int colorToHex(Color c) {
//        return Integer.decode("0x"
//                + Integer.toHexString(c.getRGB()).substring(2));
//    }
//
//    public String getColorNameFromColor(Color color) {
//        return getColorNameFromRgb(color.getRed(), color.getGreen(),
//                color.getBlue());
//    }

    /**
     * SubClass of ColorUtils. In order to lookup color name
     *
     * @author Xiaoxiao Li
     */
    public class ColorName
    {
        public int r, g, b;
        public String name;

        public ColorName(String name, int r, int g, int b)
        {
            this.r = r;
            this.g = g;
            this.b = b;
            this.name = name;
        }

        public int computeMSE(int pixR, int pixG, int pixB)
        {
            int rDif = (pixR - r) * (pixR - r);
            int gDif = (pixG - g) * (pixG - g);
            int bDif = (pixB - b) * (pixB - b);
            int totDif = (int) (rDif + gDif + bDif) / 3;

            int max = Math.min(Math.min(rDif, gDif), bDif) * 5;

            return totDif + max;
            //return (int) Math.abs(pixR - r) + Math.abs(pixG - g) + Math.abs(pixB - b);
        }

        public int getR()
        {
            return r;
        }

        public int getG()
        {
            return g;
        }

        public int getB()
        {
            return b;
        }

        public int getColorValue()
        {
            return Color.rgb(r, g, b);
        }

        public String getName()
        {
            return name;
            //check for upper case and input a space if index isnt 0
        }
    }
}