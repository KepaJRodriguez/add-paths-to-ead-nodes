package eu.ehri.add_paths_to_ead_nodes;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;


/**
* Add a path to each node of an EAD tree
*
* @author Kepa J. Rodriguez (https://github.com/KepaJRodriguez)
*/

public class App {
	public static void main(String[] args) throws XMLStreamException,
			FactoryConfigurationError, IOException {
		String eadfile = args[0];

		FileInputStream fileInputStreamEAD1 = new FileInputStream(eadfile);
		XMLOutputFactory factory = XMLOutputFactory.newInstance();
		XMLEventWriter writer = factory.createXMLEventWriter(new FileWriter(
				"out.xml"));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();

		XMLEventReader xmlEventReaderEAD1 = XMLInputFactory.newInstance()
				.createXMLEventReader(fileInputStreamEAD1);

		XMLEvent end = eventFactory.createDTD("\n");

		String top = "0";
		int cntC01 = -1;
		int cntC02 = 0;
		int cntC03 = 0;
		int cntC04 = 0;
		int cntC05 = 0;
		int cntC06 = 0;
		int cntC07 = 0;
		int cntC08 = 0;
		int cntC09 = 0;
		int cntC10 = 0;
		int cntC11 = 0;
		int cntC12 = 0;

		while (xmlEventReaderEAD1.hasNext()) {
			XMLEvent event = xmlEventReaderEAD1.nextEvent();
			writer.add(event);
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("archdesc")) {
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}

				if (event.asStartElement().getName().getLocalPart()
						.equals("c01")) {
					cntC01++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory
							.createCharacters(top + "." + cntC01));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					event = xmlEventReaderEAD1.nextEvent();
					writer.add(end);
					

				}

			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c02")) {					
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);
					cntC02++;
				}
			}

			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c03")) {
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);
					cntC03++;
				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c04")) {
					cntC04++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}

			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c05")) {
					cntC05++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c06")) {
					cntC06++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05 + "." + cntC06));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c07")) {
					cntC07++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05 + "." + cntC06 + "." + cntC07));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c08")) {
					cntC08++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05 + "." + cntC06 + "." + cntC07 + "."
							+ cntC08));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c09")) {
					cntC09++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05 + "." + cntC06 + "." + cntC07 + "."
							+ cntC08 + "." + cntC09));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c10")) {
					cntC09++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05 + "." + cntC06 + "." + cntC07 + "."
							+ cntC08 + "." + cntC09 + "." + cntC10));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c11")) {
					cntC09++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05 + "." + cntC06 + "." + cntC07 + "."
							+ cntC08 + "." + cntC09 + "." + cntC10 + "."
							+ cntC11));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}
			if (event.isStartElement()) {
				if (event.asStartElement().getName().getLocalPart()
						.equals("c12")) {
					cntC09++;
					writer.add(end);
					writer.add(eventFactory.createStartElement("", null,
							"unitid"));
					writer.add(eventFactory.createAttribute("label",
							"ehri_structure"));
					writer.add(eventFactory.createCharacters(top + "." + cntC01
							+ "." + cntC02 + "." + cntC03 + "." + cntC04 + "."
							+ cntC05 + "." + cntC06 + "." + cntC07 + "."
							+ cntC08 + "." + cntC09 + "." + cntC10 + "."
							+ cntC11 + "." + cntC12));
					writer.add(eventFactory
							.createEndElement("", null, "unitid"));
					writer.add(end);

				}
			}

			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c01")) {
					cntC02 = 0;

				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c02")) {
					cntC03 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c03")) {
					cntC04 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c04")) {
					cntC05 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c05")) {
					cntC06 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c06")) {
					cntC07 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c07")) {
					cntC08 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c08")) {
					cntC09 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c09")) {
					cntC10 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c10")) {
					cntC11 = 0;
				}
			}
			if (event.isEndElement()) {
				if (event.asEndElement().getName().getLocalPart().equals("c11")) {
					cntC12 = 0;
				}
			}

		}
		writer.close();
	}

}
