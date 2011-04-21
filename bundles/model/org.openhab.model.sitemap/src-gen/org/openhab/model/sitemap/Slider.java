/**
 * openHAB, the open Home Automation Bus.
 * Copyright (C) 2011, openHAB.org <admin@openhab.org>
 *
 * See the contributors.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or
 * combining it with Eclipse (or a modified version of that library),
 * containing parts covered by the terms of the Eclipse Public License
 * (EPL), the licensors of this Program grant you additional permission
 * to convey the resulting work.
 */

package org.openhab.model.sitemap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.model.sitemap.Slider#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.openhab.model.sitemap.Slider#isSwitchEnabled <em>Switch Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.model.sitemap.SitemapPackage#getSlider()
 * @model
 * @generated
 */
public interface Slider extends Widget
{
  /**
   * Returns the value of the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frequency</em>' attribute.
   * @see #setFrequency(String)
   * @see org.openhab.model.sitemap.SitemapPackage#getSlider_Frequency()
   * @model
   * @generated
   */
  String getFrequency();

  /**
   * Sets the value of the '{@link org.openhab.model.sitemap.Slider#getFrequency <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frequency</em>' attribute.
   * @see #getFrequency()
   * @generated
   */
  void setFrequency(String value);

  /**
   * Returns the value of the '<em><b>Switch Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Enabled</em>' attribute.
   * @see #setSwitchEnabled(boolean)
   * @see org.openhab.model.sitemap.SitemapPackage#getSlider_SwitchEnabled()
   * @model
   * @generated
   */
  boolean isSwitchEnabled();

  /**
   * Sets the value of the '{@link org.openhab.model.sitemap.Slider#isSwitchEnabled <em>Switch Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Enabled</em>' attribute.
   * @see #isSwitchEnabled()
   * @generated
   */
  void setSwitchEnabled(boolean value);

} // Slider
