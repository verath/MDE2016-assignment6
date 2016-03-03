# Assignment 6, Model Driven Engineering (Spring 2016)

The assignment was to:
  1. Create a meta-model for a configurator
  2. Enforce constraints on the meta-model via OCL
  3. Create a textual grammar in Xtext for defining configurator models
  4. Make the model executable on a platform (i.e. create a configurator model editor).
  5. Create a mapping between features and requirements, by extending an already 
  existing requirements meta-model with references to features.
  6. Create a transformation in ATL that takes a requirement model and a model
  representing selected features, and returns a new requirement model with only
  the requirements for the selected features.


## Set Up

The project was built on the Eclipse Modeling Framework (EMF), via the use of
Eclipse Modeling Tools. To easily work with the project, Eclipse Modeling Tools 
should be installed and configured to use a couple of required components.

### Install Eclipse Modeling Tools
The Eclipse Modeling Tools can be installed from the eclipse download page, 
http://www.eclipse.org/downloads/. The project was created using the Mars 
release.

### Install Modeling Components

Inside the Eclipse Modeling Tools, install the following components 
(Help -> Install Modeling Components):

- ATL
- Graphical Modeling Framework Tooling
- Xtext
- EcoreTools
- OCLTools
 
### Generate Model Code

Generated model code is not included in the repository and must be generated.
Model code is generated via the coresponding .genmodel file. To generate
the code, open the .genmodel, right click the top-level element and select
"Generate Model Code". This is should be done for:
  - `assignment6_model/model/assignment6_model.genmodel`
  - `assignment6_requirement_model/model/req_spec.genmodel`
