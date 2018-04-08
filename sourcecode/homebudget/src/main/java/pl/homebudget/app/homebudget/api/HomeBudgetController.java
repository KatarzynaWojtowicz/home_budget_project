package pl.homebudget.app.homebudget.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.homebudget.app.homebudget.to.UserTo;

@RestController
@RequestMapping(value = "/mybudget")
public class HomeBudgetController {

	public HomeBudgetController() {
		System.out.println("Bean initialized");
	}

	@RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = RequestMethod.GET)
	public String login(@PathVariable long fooid, @PathVariable long barid) {
		return "Get a specific Bar with id=" + barid + " from a Foo with id=" + fooid;
	}

	@RequestMapping(value = "/ex/bars", method = RequestMethod.GET)
	public String getBarBySimplePathWithExplicitRequestParams(@RequestParam("id") long id,
			@RequestParam("text") String text) {

		return "Narrow Get a specific Bar with id=" + id + " some text: " + text;

	}

	@RequestMapping(value = "/register/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserTo> register(@RequestBody UserTo user) throws Exception {

		if (user.getLogin() == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

}
