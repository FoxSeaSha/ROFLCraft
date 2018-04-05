package bruce.roflcraft.client.gui.screen;

import bruce.roflcraft.client.gui.component.GUIComponentBase;
import bruce.roflcraft.client.gui.component.GUIComponentManager;
import bruce.roflcraft.client.gui.component.GUIComponentScreen;
import bruce.roflcraft.client.gui.component.character.AtributeDialComponent;
import bruce.roflcraft.client.gui.component.character.AttributeFrame;
import bruce.roflcraft.client.gui.component.utl.GUITextureLayer;
import bruce.roflcraft.client.gui.component.utl.HorizontalAlignment;
import bruce.roflcraft.client.gui.component.utl.VerticalAlignment;
import bruce.roflcraft.main.Reference;
import bruce.roflcraft.rpg.character.stats.AttributeIndex;
import net.minecraft.util.ResourceLocation;

/**
 * This class is the root for the charater screen
 * @author Lorrtath
 *
 */
public class CharacterSheetScreen extends GUIComponentScreen
{
	public CharacterSheetScreen()
	{
		super();
		
		// Testing:
		
		GUIComponentManager panables = new GUIComponentManager();
		registerComponent(panables);
		//AtributeDialComponent dial = new AtributeDialComponent();
		//panables.register(dial);
		/*
		AttributeFrame bdy = new AttributeFrame(AttributeIndex.AT_MIND);
		bdy.setTop(128);
		bdy.setLeft(128);
		bdy.registerListener(dial);
		panables.register(bdy);*/
		
		GUIComponentBase test = new GUIComponentBase();
		GUITextureLayer rsc = new GUITextureLayer();
		rsc.TextureResource = new ResourceLocation(Reference.MODID , "textures/gui/attribute_frame.png");
		rsc.VAlignment = VerticalAlignment.Middle;
		rsc.HAlignment = HorizontalAlignment.Center;
		rsc.Width = 64;
		rsc.Height = 64;
		test.setRotation(45);
		test.AddResource(rsc);
		test.setUseCenter(true);
		panables.register(test);
		
		/*AttributeFrame mnd = new AttributeFrame(AttributeIndex.AT_MIND);
		mnd.setTop(0);
		mnd.setLeft(128);
		mnd.registerListener(dial);
		panables.register(mnd);
		
		AttributeFrame sul = new AttributeFrame(AttributeIndex.AT_SOUL);
		sul.setTop(0);
		sul.setLeft(2 * 128);
		sul.registerListener(dial);
		panables.register(sul);*/
	}
}