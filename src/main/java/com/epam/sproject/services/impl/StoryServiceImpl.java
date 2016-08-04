package com.epam.sproject.services.impl;

import com.epam.sproject.model.dao.StoryDAO;
import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.entity.Story;
import com.epam.sproject.model.entity.User;
import com.epam.sproject.services.StoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.*;

@Service
public class StoryServiceImpl implements StoryService {
    //@Autowired
     StoryDAO storyDao;

    //@Transactional
    public Story getStoryById(Long storyId){
		Story story = null;
		try {
			story = storyDao.getById(storyId);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (story == null) {
	    throw new IllegalArgumentException();
	} else {
	    return story;
	}
    }

    //@Transactional
    public Story getBestStory()  {
		User user = new User();
		user.setId(1L);
		user.setFullName("Straud");


		Set<User> likes = new HashSet<>();
		likes.add(user);

		Fragment rootFragmentStory = new Fragment();
		rootFragmentStory.setId(1L);
		rootFragmentStory.setTitle("Bartimaeus");
		rootFragmentStory.setAuthor(user);
		rootFragmentStory.setLikes(likes);
		rootFragmentStory.setText("The temperature of the room dropped fast. Ice formed on the curtains and" +
				"crusted thickly around the lights in the ceiling. The glowing filaments in each bulb" +
				"shrank and dimmed, while the candles that sprang from every available surface like" +
				"a colony of toadstools had their wicks snuffed out. The darkened room filled with a" +
				"yellow, choking cloud of brimstone, in which indistinct black shadows writhed and" +
				"roiled. From far away came the sound of many voices screaming. Pressure was suddenly" +
				"applied to the door that led to the landing. It bulged inward, the timbers" +
				"groaning. Footsteps from invisible feet came pattering across the floorboards and" +
				"invisible mouths whispered wicked things from behind the bed and under the desk.");


		Fragment child_child_fragment = new Fragment();
		child_child_fragment.setId(1L);
		child_child_fragment.setTitle("Kitchen");
		child_child_fragment.setAuthor(user);
		child_child_fragment.setLikes(new HashSet<>());
		child_child_fragment.setChildFragments(new HashSet<>());
		child_child_fragment.setText("Nathaniel also directed the investigators to the kitchen, where a compressed " +
				"group of under-cooks was found trembling in a pantry. They reported that about " +
				"half an hour previously, the head chef had given a great cry, burst into blue flame, " +
				"and swelled to a great and terrifying size before vanishing in a gust of brimstone. " +
				"Upon inspection, a meat cleaver was found deeply embedded in the stonework of " +
				"the fireplace, the last memento of Faquarl's bondage.");

		Fragment child_fragment1 = new Fragment();
		child_fragment1.setId(1L);
		child_fragment1.setTitle("Nathaniel");
		child_fragment1.setAuthor(user);
		child_fragment1.setLikes(likes);
		HashSet<Fragment> child_fragment_children = new HashSet<>();
		child_fragment_children.add(child_child_fragment);
		child_fragment1.setChildFragments(child_fragment_children);

		child_fragment1.setText("The boy was still watching the eyebrows. He could not wrench his gaze away " +
				"from them. Now they were furrowed sternly downward, two sharp arrowheads " +
				"meeting. They moved with a quite remarkable agility—up, down, tilting, arching, " +
				"sometimes together, sometimes singly. With their parody of independent life they " +
				"exerted a strange fascination on the boy. Besides, he found studying them infinitely " +
				"preferable to meeting his master's gaze.");

		Fragment child_fragment2 = new Fragment();
		child_fragment2.setId(1L);
		child_fragment2.setTitle("Watchful eye");
		child_fragment2.setAuthor(user);
		child_fragment2.setLikes(likes);
		child_fragment2.setChildFragments(new HashSet<>());
		child_fragment2.setText("Under his master's watchful eye, the boy crossed to the door, which was made " +
				"of a dark, unpainted wood with many whorls and grains. He had to struggle to turn " +
				"the heavy brass knob, but the coolness of its touch pleased him. The door swung " +
				"open soundlessly on oiled hinges and the boy stepped through to find himself at the " +
				"top of a carpeted staircase. The walls were elegantly papered with a flowery pattern. " +
				"A small window halfway down let in a friendly stream of sunlight.");



		HashSet<Fragment> fragments = new HashSet<>();
		fragments.add(child_fragment1);
		fragments.add(child_fragment2);
		rootFragmentStory.setChildFragments(fragments);

		Story famousStory = new Story();
		famousStory.setTitle("The Amulet of Samarkand");
		famousStory.setRating(10000L);
		famousStory.setId(1L);
		famousStory.setRootFragment(rootFragmentStory);


		/*
		List<Story> stories = storyDao.getAll();

	Story bestStory = null;
	
        if (stories == null) {
	    throw new NullPointerException();
	} else {
	    if (!stories.isEmpty()) {
		bestStory = stories.get(0);

		for (Story curStory : stories) {
		    if (curStory.getRating() > bestStory.getRating()) {
			bestStory = curStory;
		    }
		}
	    }
	}
*/
	return famousStory;
    }

   // @Transactional
    public Collection<Story> getAllStories()  {
		Collection<Story> stories = null;

		stories=new ArrayList<Story>();

		User user = new User();
		user.setId(1L);
		user.setFullName("Straud");


		Set<User> likes = new HashSet<>();
		likes.add(user);

		Fragment rootFragmentStory = new Fragment();
		rootFragmentStory.setId(1L);
		rootFragmentStory.setTitle("Bartimaeus");
		rootFragmentStory.setAuthor(user);
		rootFragmentStory.setLikes(likes);
		rootFragmentStory.setText("The temperature of the room dropped fast. Ice formed on the curtains and" +
				"crusted thickly around the lights in the ceiling. The glowing filaments in each bulb" +
				"shrank and dimmed, while the candles that sprang from every available surface like" +
				"a colony of toadstools had their wicks snuffed out. The darkened room filled with a" +
				"yellow, choking cloud of brimstone, in which indistinct black shadows writhed and" +
				"roiled. From far away came the sound of many voices screaming. Pressure was suddenly" +
				"applied to the door that led to the landing. It bulged inward, the timbers" +
				"groaning. Footsteps from invisible feet came pattering across the floorboards and" +
				"invisible mouths whispered wicked things from behind the bed and under the desk.");


		Fragment child_child_fragment = new Fragment();
		child_child_fragment.setId(1L);
		child_child_fragment.setTitle("Kitchen");
		child_child_fragment.setAuthor(user);
		child_child_fragment.setLikes(new HashSet<>());
		child_child_fragment.setChildFragments(new HashSet<>());
		child_child_fragment.setText("Nathaniel also directed the investigators to the kitchen, where a compressed " +
				"group of under-cooks was found trembling in a pantry. They reported that about " +
				"half an hour previously, the head chef had given a great cry, burst into blue flame, " +
				"and swelled to a great and terrifying size before vanishing in a gust of brimstone. " +
				"Upon inspection, a meat cleaver was found deeply embedded in the stonework of " +
				"the fireplace, the last memento of Faquarl's bondage.");

		Fragment child_fragment1 = new Fragment();
		child_fragment1.setId(1L);
		child_fragment1.setTitle("Nathaniel");
		child_fragment1.setAuthor(user);
		child_fragment1.setLikes(likes);
		HashSet<Fragment> child_fragment_children = new HashSet<>();
		child_fragment_children.add(child_child_fragment);
		child_fragment1.setChildFragments(child_fragment_children);

		child_fragment1.setText("The boy was still watching the eyebrows. He could not wrench his gaze away " +
				"from them. Now they were furrowed sternly downward, two sharp arrowheads " +
				"meeting. They moved with a quite remarkable agility—up, down, tilting, arching, " +
				"sometimes together, sometimes singly. With their parody of independent life they " +
				"exerted a strange fascination on the boy. Besides, he found studying them infinitely " +
				"preferable to meeting his master's gaze.");

		Fragment child_fragment2 = new Fragment();
		child_fragment2.setId(1L);
		child_fragment2.setTitle("Watchful eye");
		child_fragment2.setAuthor(user);
		child_fragment2.setLikes(likes);
		child_fragment2.setChildFragments(new HashSet<>());
		child_fragment2.setText("Under his master's watchful eye, the boy crossed to the door, which was made " +
				"of a dark, unpainted wood with many whorls and grains. He had to struggle to turn " +
				"the heavy brass knob, but the coolness of its touch pleased him. The door swung " +
				"open soundlessly on oiled hinges and the boy stepped through to find himself at the " +
				"top of a carpeted staircase. The walls were elegantly papered with a flowery pattern. " +
				"A small window halfway down let in a friendly stream of sunlight.");



		HashSet<Fragment> fragments = new HashSet<>();
		fragments.add(child_fragment1);
		fragments.add(child_fragment2);
		rootFragmentStory.setChildFragments(fragments);

		Story famousStory = new Story();
		famousStory.setTitle("The Amulet of Samarkand");
		famousStory.setRating(10000L);
		famousStory.setId(1L);
		famousStory.setRootFragment(rootFragmentStory);

		stories.add(famousStory);
		stories.add(famousStory);
		stories.add(famousStory);
		stories.add(famousStory);
		stories.add(famousStory);
		stories.add(famousStory);
		stories.add(famousStory);
		stories.add(famousStory);
		stories.add(famousStory);

		return stories;
		/*
		try {
			stories = storyDao.getAll();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (stories == null) {
	    	throw new NullPointerException();
		}
		else {
	    	return stories;
		}
		*/
    }
}
