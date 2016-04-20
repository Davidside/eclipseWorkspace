package com.testingPlace;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import org.apache.wicket.Session;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.model.IModel;

import com.google.common.collect.Ordering;

/**
 * DropDownChoice which sort its choices (or in HTML's terminology select's options) according it's localized value
 * and using current locale based Collator so it's sorted how it should be in particular language (ie. including national characters, 
 * using right order).
 * 
 * @author Michal Bernhard michal@bernhard.cz 2013
 *
 * @param <T>
 */
public class OrderedDropDownChoice<T> extends DropDownChoice<T> {

    private static final long serialVersionUID = 1L;

	public OrderedDropDownChoice(String id, IModel<? extends List<? extends T>> choices, IChoiceRenderer<? super T> renderer) {
        super(id, choices, renderer);
    }

    public OrderedDropDownChoice(String id, IModel<? extends List<? extends T>> choices) {
        super(id, choices);
    }

    public OrderedDropDownChoice(String id) {
        super(id);
    }

    public OrderedDropDownChoice(
            String id,
            IModel<T> model,
            IModel<? extends List<? extends T>> choices,
                    IChoiceRenderer<? super T> renderer) {

        super(id, model, choices, renderer);
    }

    @Override
    public List<? extends T> getChoices() {
        List<? extends T> unsortedChoices = super.getChoices();
        List<? extends T> sortedChoices = Ordering.from(displayValueAlphabeticComparator()).sortedCopy(unsortedChoices);

        return sortedChoices;
    }

    private Collator localeBasedTertiaryCollator() {
        Locale currentLocale = Session.get().getLocale();
        Collator collator = Collator.getInstance(currentLocale);
        collator.setStrength(Collator.TERTIARY);

        return collator;
    }

    private Comparator<T> displayValueAlphabeticComparator() {

        final IChoiceRenderer<? super T> renderer = getChoiceRenderer();

        return new Comparator<T>() {

            @Override
            public int compare(T o1, T o2) {
                Object o1DisplayValue = renderer.getDisplayValue(o1);
                Object o2DisplayValue = renderer.getDisplayValue(o2);

                return localeBasedTertiaryCollator().compare(o1DisplayValue, o2DisplayValue);
            }
        };

    }


}
